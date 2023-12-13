package gramma.InClass;

public class Stars {
    
    public static void main(String[] args) {
        int size = 10;

        System.out.println("01.");
        for (int y = size; y >= 0; y--) {
            for (int x = 0; x <= size; x++) {
                if (y <= (-x + size))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("02.");
        for (int y = size; y >= 0; y--) {
            for (int x = -size; x <= 0; x++) {
                if (y <= (x + size))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    
        System.out.println("03.");
        for (int y = size; y >= -size; y--) {
            for (int x = -size; x <= size; x++) {
                if (Math.abs(x) + Math.abs(y) <= size)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
