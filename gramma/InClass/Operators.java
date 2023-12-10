package gramma.InClass;

public class Operators {
    
    public static void main(String[] args) {
        int a = 0;
        // a++;
        // a--;
        int b = a++;
        b = a--;
        b = ++a;
        b = --a;
        // int c = ++(a--);

        System.out.println("10 % 3 = " + (10 % 3));
        System.out.println("-10 % 3 = " + (-10 % 3));
        System.out.println("10 % -3 = " + (10 % -3));
        System.out.println("-10 % -3 = " + (-10 % -3));

        a = 10;
        b = 0;
        boolean bl1 = (a == 9) && (++b == 0);
        System.out.println("b = " + b);

        a = 10;
        b = 0;
        bl1 = (a == 10) || (++b == 0);
        System.out.println("b = " + b);

        {
            int aa = 10;
        }
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
}
