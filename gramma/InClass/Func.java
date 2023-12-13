package gramma.InClass;

public class Func {
    public static void main(String[] args) {
        func1(0);
    }

    public static void func1(int n) {
        System.out.println(n);
        func1(n + 1);
    }

    public static void func2() {
        func3();
    }

    public static void func3() {
        func2();
    }
}
