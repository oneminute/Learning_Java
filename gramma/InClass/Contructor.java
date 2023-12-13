package gramma.InClass;

public class Contructor {
    
    public static void main(String[] args) {
        C c = new C(10);
        // B b = new B();
        // A a = new A();

        c.func();
        B b = new B(9);
        b.func();
        A a = new A();
        a.func();

        A a2 = new B(2);
        a2.func();

        System.out.println(a2 instanceof A);
        System.out.println(a2 instanceof B);
        System.out.println(a2 instanceof C);
        System.out.println(a2.getClass());
    }
}

class A {
    private D d = new D();
    public A() {
        System.out.println("A()");
    }

    public void func() {
        System.out.println("A.func()");
    }
}

class B extends A{

    private E e = new E();

    public B(int a) {
        System.out.println("B(a)");
    }

    // public void func() {
        // System.out.println("B.func()");
    // }
}

class C extends B {

    private D d = new D();

    public C() {
        this(0);
    }

    public C(int a) {
        super(a);
        System.out.println("C()");
    }

    public void func() {
        System.out.println("C.func()");
    }
}

class D {
    public D() {
        System.out.println("D()");
    }
}

class E extends D {
    public E() {
        System.out.println("E()");
    }
}