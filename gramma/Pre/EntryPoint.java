package gramma.Pre;

public class EntryPoint {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // use 'javac codeStructure/Pre/EntryPoint.java' to compile this program
        // use 'java codeStructure/Pre/EntryPoint' to run this program
        // use 'java codeStructure/Pre/EntryPoint hello world' to run this program
        System.out.println("size of args: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg " + i + ": " + args[i]);
        }
    }

}

// public class Class2 {

// }

class Class3 {

    public static void main(String[] args) {
        System.out.println("Class 3");
    }
}