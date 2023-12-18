package sync.InClass;

public class ThreadExample {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
    }
}

class A implements Runnable {

    public enum State {
        NORMAL, SLEEP, STOP
    }

    private State state = State.NORMAL;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("A run");
            if (state == State.NORMAL) {

            } else if (state == State.SLEEP) {

            } else if (state == State.STOP) {
                break;
            }
        }
    }
    
}