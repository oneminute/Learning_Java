package gramma.InClass;

public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample e = new ExceptionExample();
        e.example1();
    }

    public void example1() {
        try {
            int a = 0;
            int b = 10;
            System.err.println(b / a);
        } catch (Exception e) {
            System.out.println("exception");
            e.printStackTrace();
        }
    }
}
