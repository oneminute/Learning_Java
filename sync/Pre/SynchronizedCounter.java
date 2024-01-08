package sync.Pre;

public class SynchronizedCounter {

    private static final int sleepDuration = 2000;

    private int c = 0;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SynchronizedCounter() {

    }

    public SynchronizedCounter(String name) {
        this.name = name;
    }
    
    public synchronized int getValue() {
        return c;
    }

    public synchronized void increase() {
        c++;
        System.out.println("[" + name + "] after increment. c = " + c);
        try {
            Thread.sleep(sleepDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void decrease() {
        c--;
        System.out.println("[" + name + "] after decrement. c = " + c);
        try {
            Thread.sleep(sleepDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        func2();
    }

    public static void func1() {
        SynchronizedCounter counter = new SynchronizedCounter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread1 increases counter: " + i);
                    counter.increase();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread2 decrease counter: " + i);
                    counter.decrease();
                }
            }
        });

        t1.start();
        t2.start();
    }

    public static void func2() {
        SynchronizedCounter counter1 = new SynchronizedCounter("c1");
        SynchronizedCounter counter2 = new SynchronizedCounter("c2");

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread1 increases counter: " + i);
                    counter1.increase();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread2 decrease counter: " + i);
                    counter2.decrease();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
