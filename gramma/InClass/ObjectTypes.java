package gramma.InClass;

public class ObjectTypes {
    
    public static void main(String[] args) {
        Object o1 = null;
        Object o2 = new Object();
        Object o3 = o2;
        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
        System.out.println("o3 = " + o3);
        o3 = null;
        o2 = null;

        int[] arr1 = new int[5];
        System.out.println("arr1 = " + arr1);
        int[] arr2 = arr1;
        arr2[0] = 5;
        System.out.println("arr1[0] = " + arr1[0]);
    }
}
