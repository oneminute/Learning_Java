package generics.Pre;

import java.util.*;

public class WildCardsExample {

    public static void main(String[] args) {
        // you can not use a list with the type of <? extends A> to add any data into it
        ArrayList<? extends A> list1 = new ArrayList<A>();
        // list1.add(new A());  // wrong

        ArrayList<A> list2 = new ArrayList<A>();
        list2.add(new A(1));
        list2.add(new A(2));
        list2.add(new A(3));
        list2.add(new A(4));
        list2.add(new A(5));


        ArrayList<B> list4 = new ArrayList<B>();
        list4.add(new B(1));
        list4.add(new B(2));
        list4.add(new B(3));
        list4.add(new B(4));
        list4.add(new B(5));


        ArrayList<C> list5 = new ArrayList<C>();
        list5.add(new C(1));
        list5.add(new C(2));
        list5.add(new C(3));
        list5.add(new C(4));
        list5.add(new C(5));
        // list3 = list5;   // wrong

        ArrayList<Object> list6 = new ArrayList<Object>();
        list6.add(10);

        // but you can assign a list object with the type of <A> to it, and iterates it.
        ArrayList<? extends B> list3;
        // list3 = list2;   // wrong
        list3 = list4;
        list3 = list5;

        ArrayList<? super B> list7;
        list7 = list4;
        list7 = list2;
        // list7 = list5;   // wrong

    }

    public static void fill(ArrayList<?> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            // list.set(i, value);  // wrong
        }
    }

    public static void fill2(ArrayList<?> list, int value) {
        fill(list, value);  // with the fillHepler, this code works.
    }

    private static <T> void fillHelper(ArrayList<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);  // wrong
        }
    }
    
}

class A {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public A(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return String.format("[n=%d]", n);
    }
}

class B extends A {

    public B(int n) {
        super(n);
    }
}

class C extends B {

    public C(int n) {
        super(n);
    }
}

class D {
    private int n;

    public D(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return String.format("[n=%d]", n);
    }
}
