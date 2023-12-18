package gramma.InClass;

public interface DataModel {

    int THRESHOLD = 100;
    int MAX_COUNT = 1000;
    int fieldB = 200;

    public void test1(int a, String b, Object o);

    public static void test2() {
        System.out.println("test2");
    }

    public default void test3() {
        System.out.println("test3");
    }

    public void test4();
    
}

interface A extends DataModel {

    public void test1(int a, String b, Object o);
}

interface B extends DataModel {

}

interface C extends A, B {

}

abstract class DefaultDataModel implements DataModel {

}

// class CA extends DefaultDataModel {
//     public void test1(int a, String b, Object o) {
//     }

//     public void test3() {

//     }
// }

// class CB implements DataModel {
//     public void test1(int a, String b, Object o) {
//     }
// }

// class CC implements DataModel {
//     public void test1(int a, String b, Object o) {
//     }
// }

// class CD implements DataModel {
//     public void test1(int a, String b, Object o) {
//     }
// }

abstract class ClassA implements DataModel {

    private int a;

    public ClassA() {

    }

    public void test1() {

    }

    abstract public void test2();

    // abstract public void test4();
}

