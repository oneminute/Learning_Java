package generics.InClass;

import java.util.*;

public class GenericsExample {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(new Integer(20));
        list1.add(Integer.valueOf(30));
        // list1.add("Hello world");
        // list1.add(new Object());

        // Integer i1 = (Integer) list1.get(0);
        Integer i2 = list1.get(0); // type-safty
    }
}

class Adder {

    public double total = 0;

    public void add(int value) {
        total += value;
    }

    public void add(double value) {
        total += value;
    }
}

// class Adder2<T> {
//     public T total;

//     public void add(T value) {
//         total += value;
//     }
// }
