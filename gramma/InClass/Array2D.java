package gramma.InClass;

import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        int[][] arr2 = new int[3][4];
        int[][] arr3 = new int[3][];
        arr3[0] = new int[] { 1, 2, 3, 4};
        arr3[1] = new int[] { 1, 2, 3};
        arr3[2] = new int[5];
    }
}
