package sync.Pre;

public class SynchronizedCounter2 {
    
    private static final int sleepDuration = 2000;

    private int c = 0;

    private String name = "unnamed";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SynchronizedCounter2() {
    }

    public SynchronizedCounter2(String name) {
        this.name = name;
    }

    public void increase(Object obj) {
        synchronized(obj) {
            c++;
            System.out.println("[" + name + "] after increment. c = " + c);
            try {
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void decrease(Object obj) {
        synchronized(obj) {
            c--;
            System.out.println("[" + name + "] after decrement. c = " + c);
            try {
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // func1();
        func2();
    }

    public static void func1() {
        SynchronizedCounter2 counter = new SynchronizedCounter2();
        Object obj = new Object();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread1 increases counter: " + i);
                    counter.increase(obj);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread2 decrease counter: " + i);
                    counter.decrease(obj);
                }
            }
        });

        t1.start();
        t2.start();
    }

    public static void func2() {
        SynchronizedCounter2 counter = new SynchronizedCounter2();
        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread1 increases counter: " + i);
                    counter.increase(obj1);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread2 decrease counter: " + i);
                    counter.decrease(obj2);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
