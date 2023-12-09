package codeStructure.Pre;

public class Fibonacci {
    
    public static int fibonacci(int a) {
        if (a == 1)
            return 1;
        else if (a == 0)
            return 0;
        else {
            return a + fibonacci(a - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("f(0) = " + fibonacci(0));
        System.out.println("f(1) = " + fibonacci(1));
        System.out.println("f(2) = " + fibonacci(2));
        System.out.println("f(3) = " + fibonacci(3));
        System.out.println("f(4) = " + fibonacci(4));
    }
}
