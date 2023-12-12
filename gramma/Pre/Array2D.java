package gramma.Pre;

public class Array2D {
    
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3]; 
        arr1 [0][0] = 1;
        arr1 [0][1] = 0;
        arr1 [0][2] = 0;
        arr1 [1][0] = 0;
        arr1 [1][1] = 1;
        arr1 [1][2] = 0;
        arr1 [2][0] = 0;
        arr1 [2][1] = 0;
        arr1 [2][2] = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; arr1[i] != null && j < arr1[i].length; j++) {
                System.out.printf("%4d", arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr2 = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[1];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; arr2[i] != null && j < arr2[i].length; j++) {
                System.out.printf("%4d", arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr3 = {{1,2,3,4,5,6}, {9,8,7}};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; arr3[i] != null && j < arr3[i].length; j++) {
                System.out.printf("%4d", arr3[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
