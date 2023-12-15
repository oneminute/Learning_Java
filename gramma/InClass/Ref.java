package gramma.InClass;

import java.util.*;

public class Ref {
    
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        // let arr of initArray equals to arr1
        // arr = arr1
        // initArray(arr1, 10);
        arr1 = initArray(10);
        int[] arr2 = { 1, 2, 3 };
        fill(arr2, 100);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr4 = new int[7];

        arr4 = Arrays.copyOf(arr3, 5);
        System.out.println(Arrays.toString(arr4));

        arr4 = Arrays.copyOfRange(arr3, 2, 6);
        System.out.println(Arrays.toString(arr4));
    }

    public static void fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }

    public static int[] initArray(int length) {
        int[] arr = new int[length]; // { 4, 5, 6 };
        return arr;
    }

    public static void initArray(int[] arr, int length) {
        arr = new int[length];
    }
}
