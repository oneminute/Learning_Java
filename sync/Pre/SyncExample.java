package sync.Pre;

import java.util.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class SyncVar<T> {
    private T value;

    public SyncVar(T value) {
        this.value = value;
    }

    public synchronized T getValue() {
        return value;
    }

    public synchronized void setValue(T value) {
        this.value = value;
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SyncExample extends Application{

    private int tasksNum = 4;

    private SyncVar<Integer> var1 = new SyncVar<Integer>(0);

    private ArrayList<TextArea> textAreas = new ArrayList<>();
    private ArrayList<Label> stateLabels = new ArrayList<>();
    private HashMap<Integer, Thread> threads = new HashMap<Integer, Thread>();
    private HashMap<Integer, Task> tasks = new HashMap<Integer, Task>();
    private Thread currentThread = null;
    private ToggleGroup toggleGroup = new ToggleGroup();
    private Label res1Label = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox toolBar = new HBox();
        toolBar.setSpacing(10);
        Button startAllButton = new Button("Start All");
        toolBar.getChildren().add(startAllButton);
        startAllButton.setOnAction(e -> {
            for (int i = 0; i < tasksNum; i++) {
                createThread(i);
            }
        });
        res1Label = new Label();
        toolBar.getChildren().add(res1Label);

        HBox center = new HBox();
        center.setSpacing(10);
        for (int i = 0; i < tasksNum; i++) {
            center.getChildren().add(createTaskControls(i, center));
        }
        BorderPane root = new BorderPane();
        root.setTop(toolBar);
        root.setCenter(center);
        center.prefWidthProperty().bind(root.widthProperty());
        Scene scene = new Scene(root, 960, 540);
        primaryStage.setTitle("Multiple Threads");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setOnCloseRequest(e -> {
            System.out.println("Stop all the tasks.");
            for (Task task: tasks.values()) {
                task.doStop();
            }
        });
    }

    private VBox createTaskControls(int n, HBox root) {
        Label stateLabel = new Label();
        stateLabels.add(stateLabel);

        TextArea textArea = new TextArea();
        textArea.setMaxWidth(Integer.MAX_VALUE);
        textArea.prefHeightProperty().bind(root.heightProperty());
        textArea.setWrapText(true);
        textAreas.add(textArea);

        GridPane gridPane = new GridPane();

        gridPane.add(new Label("Duration:"), 0, 0);
        Spinner<Integer> sleepDurationSpinner = new Spinner<Integer>();
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactory = 
         new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 60);
        sleepDurationSpinner.setValueFactory(valueFactory);
        valueFactory.setValue(10);
        gridPane.add(sleepDurationSpinner, 1, 0);

        gridPane.add(new Label("Priority"), 0, 1);
        Spinner<Integer> prioritySpinner = new Spinner<Integer>();
        SpinnerValueFactory.IntegerSpinnerValueFactory priorityValueFactory = 
         new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
        prioritySpinner.setValueFactory(priorityValueFactory);
        priorityValueFactory.setValue(Thread.NORM_PRIORITY);
        prioritySpinner.valueProperty().addListener((e, oldValue, newValue) -> {
            Thread thread = threads.get(n);
            thread.setPriority(newValue);
        });
        gridPane.add(prioritySpinner, 1, 1);

        Button startButton = new Button("Start");
        startButton.setOnAction(e -> {
            createThread(n);
        });

        Button sleepButton = new Button("Sleep");
        sleepButton.setOnAction(e -> {
            // try {
            //     Thread.sleep(sleepDurationSpinner.getValue() * 1000);
            // } catch (InterruptedException e1) {
            //     e1.printStackTrace();
            // }
            Task task = tasks.get(n);
            task.doSleep(sleepDurationSpinner.getValue() * 1000);
        });

        Button joinButton = new Button("Join");
        joinButton.setOnAction(e -> {
            Task task = tasks.get(n);
            task.doJoin(currentThread);
        });

        Button stopButton = new Button("Stop");
        stopButton.setOnAction(e -> {
            Task task = tasks.get(n);
            task.doStop();
        });

        Button interruptButton = new Button("Inter");
        interruptButton.setOnAction(e -> {
            Thread thread = threads.get(n);
            thread.interrupt();
        });

        Button setVarButton = new Button("Set");
        setVarButton.setOnAction(e -> {
            var1.setValue(n);
        });

        Button getVarButton = new Button("Get");
        setVarButton.setOnAction(e -> {
            System.out.println(var1.getValue());
        });

        HBox buttonsBox = new HBox(startButton, sleepButton, joinButton, stopButton, interruptButton, setVarButton, getVarButton);

        RadioButton radioButton = new RadioButton("Task" + n);
        radioButton.setToggleGroup(toggleGroup);
        radioButton.setOnAction(e -> {
            Thread thread = threads.get(n);
            currentThread = thread;
        });

        VBox vBox = new VBox(radioButton, textArea, gridPane, buttonsBox, stateLabel);
        return vBox;
    }

    public void createThread(int n) {
        Task task = new Task(this, n);
        Thread thread = new Thread(task);
        thread.setName("Thread" + n);
        threads.put(n, thread);
        tasks.put(n, task);
        thread.start();
    }

    public void appendTaskValue(int n, int value) {

        Platform.runLater(new Runnable() {
            public void run() {
                TextArea textArea = textAreas.get(n);
                textArea.appendText(Integer.toString(value) + " ");
            }
        });
    }

    public void updateTaskStateUI(int n, State state) {
        Platform.runLater(new Runnable() {
            public void run() {
                Label stateLabel = stateLabels.get(n);
                stateLabel.setText(state.toString());
            }
        });
    }

    private int res1 = 0;
    public synchronized void func1() {
        Thread thread = Thread.currentThread();
        System.out.println("thread: " + thread.getName());
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread: " + thread.getName() + ": func1 finished.");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

enum State {
    NORMAL, SLEEP, JOIN, STOP, CALL1
}

class Task implements Runnable {

    private SyncExample view;

    private int number = -1;

    private int value = 0;

    private int interval = 1000;

    private int sleepDuration = 3000;

    private State state = State.NORMAL;

    private Thread targetThread;

    public Task(SyncExample view, int num) {
        this.view = view;
        number = num;
        updateState();
    }

    @Override
    public void run() {
        while (true) {
            updateState();
            if (state == State.NORMAL) {
                value++;
                appendNumber();
                // view.func1();
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (state == State.SLEEP) {
                try {
                    Thread.sleep(sleepDuration);
                    state = State.NORMAL;
                } catch (InterruptedException e) {
                    state = State.NORMAL;
                    e.printStackTrace();
                }
            } else if (state == State.JOIN) {
                try {
                    System.out.println("is going to join the thread " + targetThread.getName());
                    targetThread.join();
                    System.out.println("after joining the thread " + targetThread.getName());
                    state = State.NORMAL;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (state == State.CALL1) {
                view.func1();
                state = State.NORMAL;
            } else if (state == State.STOP) {
                break;
            }
        }
    }

    public void appendNumber() {
        view.appendTaskValue(number, value);
    }

    public void updateState() {
        view.updateTaskStateUI(number, state);
    }

    public void doSleep(int milliseconds) {
        this.sleepDuration = milliseconds;
        state = State.SLEEP;
    }

    public void doJoin(Thread thread) {
        this.targetThread = thread;
        state = State.JOIN;
    }

    public void doStop() {
        state = State.STOP;
    }

    public void doCall1() {
        state = State.CALL1;
    }
}