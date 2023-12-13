package gramma.Pre;

import java.util.*;

public class LambdaExample {
    
    public static void main(String[] args) {
        interface1 i1 = (a) -> System.out.println("lambda: " + a);
        i1.func1(5);

        interface1 i2 = closure(20);
        interface1 i3 = closure(30);
        i2.func1(5);
        i3.func1(5);

        List<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 100);
            data.add(num);
        }

        System.out.println("before sorting: ");
        showData(data);

        System.out.println();
        data.sort((p1, p2) -> (p2 - p1));
        System.out.println("after sorting: ");
        showData(data);
    }

    public static void showData(List<Integer> data) {
        for (int i  = 0; i < data.size(); i++) {
            System.out.printf("%4d", data.get(i));
        }
    }

    public static interface1 closure(int n) {
        interface1 i1 = p -> System.out.println("closure: " + (p + n));
        return i1;
    }
}

interface interface1 {
    void func1(int n);
}
