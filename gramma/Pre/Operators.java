package gramma.Pre;

public class Operators {
    
    public static void main(String[] args) {
        // postfix
        int a = 0;
        a++;
        System.out.println("a++; a = " + a);
        a--;
        System.out.println("a--; a = " + a);

        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));

        // unary
        ++a;
        System.out.println("++a; a = " + a);
        --a;
        System.out.println("--a; a = " + a);
        System.out.println("++a = " + (++a));
        System.out.println("--a = " + (--a));

        a = 0xF0F0F0F0;
        System.out.printf("hex a = 0x%08X\n", a);
        a = ~a;
        System.out.printf("hex ~a = 0x%08X\n", a);

        boolean b = true;
        b = !b;

        // multiplicative
        int c = 100;
        int r = c % 7;
        System.out.println("100 % 7 = " + r);
        System.out.println("100 % 7 = " + (100 % 7));
        System.out.println("100 % -7 = " + (100 % -7));
        System.out.println("-100 % 7 = " + (-100 % 7));
        System.out.println("-100 % -7 = " + (-100 % -7));

        // shift
        int v1 = 0x80000000;
        System.out.println(v1);
        System.out.println("01234567890123456789012345678901");
        System.out.println(Long.toBinaryString(v1 + 0x1_00_00_00_00l));
        for (int i = 0; i < 32; i++) {
            v1 = v1 >>> 1;
            System.out.println(Long.toBinaryString(v1 + 0x100000000l).substring(1) + "    " + i);
        }
        System.out.println();

        v1 = 0x80000000;
        System.out.println("01234567890123456789012345678901");
        System.out.println(Long.toBinaryString(v1 + 0x200000000l).substring(1));
        for (int i = 0; i < 32; i++) {
            v1 = v1 >> 1;
            System.out.println(Long.toBinaryString(v1 + 0x200000000l).substring(1) + "    " + i);
        }
        System.out.println();

        v1 = 0x40000000;
        System.out.println("01234567890123456789012345678901");
        System.out.println(Long.toBinaryString(v1 + 0x100000000l).substring(1));
        for (int i = 0; i < 32; i++) {
            v1 = v1 >> 1;
            System.out.println(Long.toBinaryString(v1 + 0x100000000l).substring(1) + "    " + i);
        }
        System.out.println();

        v1 = 0x00000001;
        System.out.println("01234567890123456789012345678901");
        System.out.println(Long.toBinaryString(v1 + 0x100000000l).substring(1));
        for (int i = 0; i < 32; i++) {
            v1 = v1 << 1;
            System.out.println(Long.toBinaryString(v1 + 0x100000000l).substring(1) + "    " + i);
        }

        // instanceof
        Object o1 = new Object();
        System.out.println("o1 instanceof Object = " + (o1 instanceof Object));
        System.out.println("null instanceof Object = " + (null instanceof Object));
        int[] arr1 = new int[4];
        System.out.println("arr1 instanceof Object = " + (arr1 instanceof Object));
        A objA1 = new A();
        B objB1 = new B();
        System.out.println("objA1 instanceof A = " + (objA1 instanceof A));
        System.out.println("objA1 instanceof B = " + (objA1 instanceof B));
        System.out.println("objB1 instanceof A = " + (objB1 instanceof A));
        System.out.println("objB1 instanceof B = " + (objB1 instanceof B));

        // && ||
        int c1 = 10;
        int c2 = 10;
        boolean bl = c1 == 10 || --c2 == 10;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("bl = " + bl);

        c1 = 10;
        c2 = 10;
        bl = c1 != 10 || --c2 == 10;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("bl = " + bl);

        c1 = 10;
        c2 = 10;
        bl = c1 == 10 && --c2 == 10;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("bl = " + bl);

        c1 = 10;
        c2 = 10;
        bl = c1 != 10 && --c2 == 10;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("bl = " + bl);
    }
}

class A {

}

class B extends A {

}