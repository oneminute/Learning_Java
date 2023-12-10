package gramma.InClass;

public class EntryPoint {
    
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("args.length = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg " + i + ": " + args[i]);
        }
    }
}

class A {
    public static void main(String[] args) {
        System.out.println("A");
    }
}

class B {

}