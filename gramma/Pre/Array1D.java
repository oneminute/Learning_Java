package gramma.Pre;

import java.util.Arrays;

public class Array1D {
    
    public static void main(String[] args) {
        int length = 10;

        // default value
        byte[] arrByte = new byte[length];
        short[] arrShort = new short[length];
        char[] arrChar = new char[length];
        int[] arrInt = new int[length];
        long[] arrLong = new long[length];
        float[] arrFloat = new float[length];
        double[] arrDouble = new double[length];
        boolean[] arrBool = new boolean[length];

        System.out.println("arrByte[0] = " + arrByte[0]);
        System.out.println("arrShort[0] = " + arrShort[0]);
        System.out.println("arrChar[0] = " + arrChar[0]);
        System.out.println("arrInt[0] = " + arrInt[0]);
        System.out.println("arrLong[0] = " + arrLong[0]);
        System.out.println("arrFloat[0] = " + arrFloat[0]);
        System.out.println("arrDouble[0] = " + arrDouble[0]);
        System.out.println("arrBool[0] = " + arrBool[0]);

        // initialize
        byte[] arrByte1 = {0, 1, 2};
        byte[] arrByte2 = new byte[] {0, 1, 2};
        // byte[] arrByte3 = new byte[3] {0, 1, 2};
        // byte[] arrByte4 = new byte[8] {0};

        int[] arrInt1 = {0, 1, 2, 9, 8, 38, 2, 42, 56};
        int[] arrInt2 = new int[] {0, 1, 2};
        // int[] arrInt3 = new int[3] {0, 1, 2};
        // int[] arrInt4 = new int[8] {0};

        int[] arrInt5 = arrInt1; // no copy

        for (int i = 0; i < arrInt1.length; i++) {
            System.out.println("arrInt1[" + i + "] = " + arrInt1[i]);
        }
        System.out.println();

        // System.arraycopy
        int[] arrInt6 = new int[6];
        System.arraycopy(arrInt5, 2, arrInt6, 3, 2);
        for (int i = 0; i < arrInt6.length; i++) {
            System.out.println("arrInt6[" + i + "] = " + arrInt6[i]);
        }
        System.out.println();

        int[] arrInt7 = Arrays.copyOf(arrInt5, 5);
        for (int i = 0; i < arrInt7.length; i++) {
            System.out.println("arrInt7[" + i + "] = " + arrInt7[i]);
        }

        System.out.println();
        Arrays.stream(arrInt7).map(i -> i * 2).forEach(System.out::println);
    }
}
