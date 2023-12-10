package gramma.InClass;

public class Fac {
    public static int fac(int n) {
        if (n <= 1)
            return 1;
        return n * fac(n - 1);
    }

    public static int fab(int n) {
        if (n <= 1)
            return 1;
        if (n == 2)
            return 1;
        return fab(n - 1) + fab(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fac(0));
        System.out.println(fac(1));
        System.out.println(fac(2));
        System.out.println(fac(3));
        System.out.println(fac(4));
        System.out.println(fac(5));

        System.out.println(fab(3));
        System.out.println(fab(4));
        System.out.println(fab(5));
        System.out.println(fab(6));
        System.out.println(fab(7));
    }
}
