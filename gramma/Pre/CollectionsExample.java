package gramma.Pre;

import java.util.*;

public class CollectionsExample {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(8);
        list1.add(12);
        list1.add(7);
        System.out.println(list1);
        System.out.println(list1.get(2));

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(2);
        list2.add(8);
        list2.add(12);
        list2.add(7);
        System.out.println(list2);
        System.out.println(list2.get(2));

        Vector<Integer> list3 = new Vector<>();
        list3.add(4);
        list3.add(2);
        list3.add(8);
        list3.add(12);
        list3.add(7);
        System.out.println(list3);
        System.out.println(list3.get(2));

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(4);
        set1.add(2);
        set1.add(8);
        set1.add(12);
        set1.add(7);
        System.out.println(set1);
        // System.out.println(set1.get(2));

        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
        set2.add(4);
        set2.add(2);
        set2.add(8);
        set2.add(12);
        set2.add(7);
        System.out.println(set2);

        TreeSet<Integer> set3 = new TreeSet<Integer>();
        set3.add(4);
        set3.add(2);
        set3.add(8);
        set3.add(12);
        set3.add(7);
        System.out.println(set3);

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(4, "four");
        map1.put(3, "three");
        map1.put(8, "eight");
        map1.put(6, "six");
        map1.put(12, "twelve");
        System.out.println(map1);

        Hashtable<Integer, String> map2 = new Hashtable<Integer, String>();
        map2.put(4, "four");
        map2.put(3, "three");
        map2.put(8, "eight");
        map2.put(6, "six");
        map2.put(12, "twelve");
        System.out.println(map2);

        TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
        map3.put(4, "four");
        map3.put(3, "three");
        map3.put(8, "eight");
        map3.put(6, "six");
        map3.put(12, "twelve");
        System.out.println(map3);
    }
}

class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class EmployeeModel extends ArrayList<Employee> {

}
