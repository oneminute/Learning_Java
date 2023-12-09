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
    }
}
