package codeStructure.Pre;

public class ObjectTypes {
    
    public static void main(String[] args) {
        Object o1 = null;
        Object o2 = new Object();
        Object o3 = o2;
        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
        System.out.println("o3 = " + o3);
        Object o4 = new Object();
        System.out.println("o4 = " + o4);

        int[] arr1 = new int[5];
        System.out.println("arr1 = " + arr1);
        int[] arr2 = arr1;
        System.out.println("arr2 = " + arr2);
        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr2[0] = " + arr2[0]);
        arr2[0] = 5;
        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr2[0] = " + arr2[0]);
        arr1[2] = 10;
        System.out.println("arr1[2] = " + arr1[2]);
        System.out.println("arr2[2] = " + arr2[2]);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        int[] arr3 = java.util.Arrays.copyOfRange(arr1, 2, 4);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
        java.util.Arrays.stream(arr1).map(i -> i * 2).forEach(System.out::println);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
    }
}
