package generics.InClass;

import java.util.*;

public class wildCardsExample {
    public static void main(String[] args) {
        ArrayList<A> list1 = new ArrayList<A>();
        list1.add(new A());
        list1.add(new B());
        list1.add(new C());

        ArrayList<B> list2 = new ArrayList<B>();
        // list2.add(new A());
        list2.add(new B());
        list2.add(new C());

        A o1 = new B();
        o1 = new C();
        ArrayList<? extends A> list3 = new ArrayList<B>();
        // list3.add(new A());
        // list3.add(new B());
        // list3.add(new C());
        list3 = new ArrayList<C>();

        ArrayList<? extends B> list4;
        list4 = new ArrayList<B>();
        list4 = new ArrayList<C>();
        // list4 = new ArrayList<A>(); // wrong

        ArrayList<? super B> list5;
        list5 = new ArrayList<B>();
        list5 = new ArrayList<A>();
        // list5 = new ArrayList<C>(); // wrong
    }

    public static void fill(ArrayList<?> list, int value) {
        // fill2(list, value);
    }

    public static<T> void fill2(ArrayList<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }
}

class A {

}

class B extends A {

}

class C extends B {

}