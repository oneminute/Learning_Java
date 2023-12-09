package gramma.Pre;

public class Fibonacci {
    
    public static int fibonacci(int a) {
        if (a == 1)
            return 1;
        else if (a == 2)
            return 1;
        else {
            return fibonacci(a - 2) + fibonacci(a - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("f(2) = " + fibonacci(2));
        System.out.println("f(3) = " + fibonacci(3));
        System.out.println("f(4) = " + fibonacci(4));
        System.out.println("f(5) = " + fibonacci(5));
        System.out.println("f(6) = " + fibonacci(6));
        System.out.println("f(7) = " + fibonacci(7));
    }
}
