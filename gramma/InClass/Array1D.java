package gramma.InClass;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class Array1D {

    private static byte[] data = new byte[1024 * 1024 * 1024];
    
    public static void main(String[] args) {
        int length = 10;

        byte[] arrByte = new byte[length];
        short[] arrShort;
        arrShort = new short[length];
        boolean[] arrBool = new boolean[length];
            System.out.println(java.util.Arrays.toString(arrByte));
            System.out.println(java.util.Arrays.toString(arrShort));
            System.out.println(java.util.Arrays.toString(arrBool));

        int[] arrInt1 = new int[] { 5, 8, 13, 3, 4};
            System.out.println(java.util.Arrays.toString(arrInt1));

        int[] arrInt2 = { 0, 1, 2, 3, 5 };
            System.out.println(java.util.Arrays.toString(arrInt2));

        int[] arrInt3 = new int[10000];
        java.util.Arrays.fill(arrInt3, 10);
            System.out.println(java.util.Arrays.toString(arrInt3));

        for (int i = 0; i < arrInt2.length; i++) {
            arrInt2[i] *= 2;
            System.out.println(arrInt2[i]);
        }

        int i = 0;
        for (int it: arrInt2) {
            System.out.println(it);
            i++;
        }

        IntStream is = java.util.Arrays.stream(arrInt2).map(o -> o * 2);
        System.out.println(Arrays.toString(arrInt2));

        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
