package gramma.Pre;

public class PrimitiveTypes {
    
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 127;
        byte b3 = -128;
        // byte b4 = 128;   // what happened?
        // byte b5 = -129;
        byte b6 = (byte) 128;
        byte b7 = (byte) -129;
        // byte b8 = b2 + 1;
        byte b9 = ++b2;
        byte b10 = --b3;
        byte b11 = 0x7f; // hex
        byte b12 = 0177; // oct

        System.out.println("b6 = " + b6);
        System.out.println("b7 = " + b7);
        System.out.println("b9 = " + b9);
        System.out.println("b10 = " + b10);
        System.out.println("min byte value: " + Byte.MIN_VALUE);
        System.out.println("max byte value: " + Byte.MAX_VALUE);

        short s1 = 1;
        short s2 = 32767;
        short s3 = -32768;
        // short s4 = 32768;
        // short s5 = -32769;
        short s6 = (short) 32768;
        short s7 = (short) -32769;
        // short s8 = s2 + 1;
        short s9 = ++s2;
        short s10 = --s3;
        short s11 = 0x7fff;
        short s12 = 07777;

        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);
        System.out.println("s9 = " + s9);
        System.out.println("s10 = " + s10);
        System.out.println("min short value: " + Short.MIN_VALUE);
        System.out.println("max short value: " + Short.MAX_VALUE);

        int i1 = 1;
        int i2 = 2147483647;
        int i3 = -2147483648;
        // int i4 = 2147483648;
        // int i5 = -2147483649;
        int i6 = (int) 2147483648l;
        int i7 = (int) -2147483649l;
        // int i8 = i2 + 1;
        int i9 = ++i2;
        int i10 = --i3;
        int i11 = 0xAA_BB_CC_DD;
        int i12 = 55_22;
        int i13 = 5_____1;

        System.out.println("i6 = " + i6);
        System.out.println("i7 = " + i7);
        System.out.println("i9 = " + i9);
        System.out.println("i10 = " + i10);
        System.out.println("min int value: " + Integer.MIN_VALUE);
        System.out.println("max int value: " + Integer.MAX_VALUE);
        System.out.println("i11 = " + i11);
        System.out.println("i12 = " + i12);
        System.out.println("i13 = " + i13);

        long l1 = 1;
        long l2 = 32767;
        long l3 = -32768;
        // long i4 = 32768;
        // long i5 = -32769;
        long l6 = (long) 32768;
        long l7 = (long) -32769;
        // long i8 = i2 + 1;
        long l9 = ++i2;
        long l10 = --i3;

        System.out.println("l6 = " + l6);
        System.out.println("l7 = " + l7);
        System.out.println("l9 = " + l9);
        System.out.println("l10 = " + l10);
        System.out.println("min long value: " + Long.MIN_VALUE);
        System.out.println("max long value: " + Long.MAX_VALUE);

        char c1 = 'a';
        char c2 = 'z';
        char c3 = 65;
        char c4 = 90;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("dec: " + (int) c + ", ascii: " + c);
        }

        System.out.println("max char value: " + (int) Character.MIN_VALUE);
        System.out.println("max char value: " + (int) Character.MAX_VALUE);

        for (char c = '阿'; c <= '阿' + 100; c++) {
            System.out.println("dec: " + (int) c + ", ascii: " + c);
        }

        float f1 = 1.0f;
        float f2 = .3f;
        float f3 = 1.f;
        float f4 = 1e10f;
        float f5 = 1e-10f;
        float f6 = .1234567890123456789f;
        System.out.println("f6 = " + f6);
        System.out.println("min float value: " + Float.MIN_VALUE);
        System.out.println("max float value: " + Float.MAX_VALUE);

        double d1 = 1.0;
        double d2 = .3;
        double d3 = 1.;
        double d4 = 1e10;
        double d5 = 1e-10;
        double d6 = .1234567890123456789;
        System.out.println("d6 = " + d6);
        System.out.println("min double value: " + Double.MIN_VALUE);
        System.out.println("max double value: " + Double.MAX_VALUE);

        boolean bl1 = false;
        boolean bl2 = true;
        System.out.println("bl1 = " + bl1);
        System.out.println("bl2 = " + bl2);

        // b1 = s1;
        // b1 = c1;
        // b1 = i1;
        // b1 = l1;
        // b1 = bl1;
        // b1 = f1;
        // b1 = d1;
    
        s1 = b1;
        // s1 = c1;
        // s1 = i1;
        // s1 = l1;
        // s1 = bl1;
        // s1 = f1;
        // s1 = d1;

        i1 = b1;
        i1 = s1;
        i1 = c1;
        // i1 = l1;
        // i1 = bl1;
        // i1 = f1;
        // i1 = d1;

        l1 = b1;
        l1 = s1;
        l1 = c1;
        l1 = i1;
        // l1 = bl1;
        // l1 = f1;
        // l1 = d1;

        f1 = b1;
        f1 = s1;
        f1 = c1;
        f1 = i1;
        f1 = l1;
        // f1 = bl1;
        // f1 = d1;

        d1 = b1;
        d1 = s1;
        d1 = c1;
        d1 = i1;
        d1 = l1;
        d1 = f1;
        // d1 = bl1;
    }
}
