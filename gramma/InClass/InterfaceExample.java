package gramma.InClass;

import java.util.*;

public class InterfaceExample {
    public static <Interger, T> void main(String[] args) {
        // ClassA ca = new ClassA();
        // DataModel da = new DataModel();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 9; i >= 0; i--) {
            list.add(i);
        }
        MyComparator comparator = new MyComparator();
        list.sort(comparator);

        System.out.println(list);

        MyList myList = new MyList();
        myList.add(3.2);
        myList.get(0);
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        java.util.Random rand = new Random();
        return rand.nextInt(-2, 2);
    }

}

class MyList extends ArrayList<Double> {

}