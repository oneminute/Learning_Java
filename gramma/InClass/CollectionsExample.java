package gramma.InClass;

import java.util.*;

public class CollectionsExample {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(8);
        list1.add(8);
        list1.add(6);
        list1.add(7);
        list1.add(2);
        list1.add(9);
        list1.add(9);
        System.out.println(list1);
        System.out.println(list1.get(5));
        // list1.clear();
        for (int i = list1.size() - 1; i >= 0; i--) {
             list1.remove(i);
        }
        // for (; !list1.isEmpty();) {
        //     // list1.remove(i);
        //     list1.remove(0);
        // }
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        System.out.println();
        list2.add(5);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(8);
        list2.add(8);
        list2.add(6);
        list2.add(7);
        list2.add(2);
        list2.add(9);
        list2.add(9);
        System.out.println(list2);
        System.out.println(list2.get(5));

        Vector<Integer> list3 = new Vector<Integer>();
        System.out.println();
        list3.add(5);
        list3.add(1);
        list3.add(3);
        list3.add(4);
        list3.add(8);
        list3.add(8);
        list3.add(6);
        list3.add(7);
        list3.add(2);
        list3.add(9);
        list3.add(9);
        System.out.println(list3);
        System.out.println(list3.get(5));

        HashSet<Integer> set1 = new HashSet<Integer>();
        System.out.println();
        set1.add(5);
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(8);
        set1.add(8);
        set1.add(6);
        set1.add(7);
        set1.add(2);
        set1.add(9);
        set1.add(9);
        System.out.println(set1);
        // System.out.println(set1.get(5));
        for (int s: set1) {
            System.out.println(s);
        }

        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
        System.out.println();
        set2.add(5);
        set2.add(1);
        set2.add(3);
        set2.add(4);
        set2.add(8);
        set2.add(8);
        set2.add(6);
        set2.add(7);
        set2.add(2);
        set2.add(9);
        set2.add(9);
        System.out.println(set2);

        TreeSet<Integer> set3 = new TreeSet<Integer>();
        System.out.println();
        set3.add(5);
        set3.add(1);
        set3.add(3);
        set3.add(4);
        set3.add(8);
        set3.add(8);
        set3.add(6);
        set3.add(7);
        set3.add(2);
        set3.add(9);
        set3.add(9);
        System.out.println(set3);

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "one");
        map1.put(3, "three");
        map1.put(12, "twelve");
        map1.put(6, "six");
        map1.put(8, "eight");
        System.out.println(map1);

        Hashtable<Integer, String> map2 = new Hashtable<Integer, String>();
        map2.put(1, "one");
        map2.put(3, "three");
        map2.put(12, "twelve");
        map2.put(6, "six");
        map2.put(8, "eight");
        System.out.println(map2);

        TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
        map3.put(1, "one");
        map3.put(3, "three");
        map3.put(12, "twelve");
        map3.put(6, "six");
        map3.put(8, "eight");
        System.out.println(map3);

        System.out.println();
        HashSet<Employee> setEmp = new HashSet<Employee>();
        setEmp.add(new Employee(1));
        setEmp.add(new Employee(2));
        setEmp.add(new Employee(3));
        setEmp.add(new Employee(4));
        setEmp.add(new Employee(5));
        System.out.println(setEmp);
    }
}

class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public Employee() {
        this(0);
    }

    public Employee(int id) {
        this.id = id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Employee))
            return false;
        Employee empOther = (Employee) other;
        // return this.id == empOther.getId();
        return this.hashCode() == other.hashCode();
    }

    public String toString() {
        return "[id: " + id + "]";
    }
}
