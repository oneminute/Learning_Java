package gramma.Pre;

public class Stars {
    
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        
        System.out.println("01.");
        for (int y = rows; y >= 0; y--) {
            for (int x = 0; x <= cols; x++) {
                if (y <= -x + rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("02.");
        for (int y = rows; y >= 0; y--) {
            for (int x = -cols; x <= 0; x++) {
                if (y <= x + rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("03.");
        for (int y = rows; y >= 0; y--) {
            for (int x = 0; x <= cols; x++) {
                if (y >= -x + rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("04.");
        for (int y = rows; y >= 0; y--) {
            for (int x = -cols; x <= 0; x++) {
                if (y >= x + rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("05.");
        for (int y = rows; y >= -rows; y--) {
            for (int x = -cols; x <= cols; x++) {
                if (Math.abs(x) + Math.abs(y) <= cols)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
