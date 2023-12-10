package gramma.Pre;

public class Constructor {
    public static void main(String[] args) throws Exception {
        C c = new C();  // 请分析输出结果
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

class A {
    int a;
    int b;

    public A() {
        System.out.println("A()");
    }
}

class B extends A {

    // 在调用自已的构造函数之前，先构造成员变量
    int a = 5;
    int b;
    int c;
    int d;
    private E e = new E();
    
    public B(int a) {
        // 如果声明了有参构造函数，那么无参默认构造函数失效
        // custom
        System.out.println("B()");
    }
}

class C extends B {

    private D d = new D();

    public C() {
        super(10);    // explicit 无论，是否写这一句，系统都会加上这一句对父类无参构造函数的调用。而且这句代码必须在构造函数中的第一句。
        System.out.println("C()");
    }

    public C(int a) {
        // 任一构造函数，默认调用父类的无参构造函数
        // super(a); // 显示调用父类带参构造函数
        this();
    }

    public void methodA() {
        methodA(0);
    }

    public void methodA(int a) {
        // 省略10000行业务代码。
    }
}