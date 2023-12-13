package gramma.Pre;

public class FunctionExample {
    
    public static void main(String[] args) {
        FunctionExample e1 = new FunctionExample();
        e1.func(0);
    }

    public void func(int n) {
        System.out.printf("n = 0x%4X\n", n);
        func(n + 1);
    }
}
