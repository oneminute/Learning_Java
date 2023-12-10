package gramma.InClass;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 127;
        byte b3 = -128;
        byte b4 = (byte) 128;
        System.out.println("b4 = " + b4);
        byte b5 = (byte) -129;
        System.out.println("b5 = " + b5);
        byte b6 = (byte) (b2 + 1);
        byte b7 = ++b2;
        byte b8 = --b3;
        // for (byte bb = 0; bb < 200; bb++) {
        // }
        byte b9 = 0x40;
        byte b10 = 0100;

        int i1 = 0x20_40_F0________50;

        Byte B1 = new Byte(b1);
        System.out.println("min byte value: " + Byte.MIN_VALUE);
        System.out.println("max byte value: "+ Byte.MAX_VALUE);

        System.out.println("min short value: " + Short.MIN_VALUE);
        System.out.println("max short value: "+ Short.MAX_VALUE);

        System.out.println("min int value: " + Integer.MIN_VALUE);
        System.out.println("max int value: "+ Integer.MAX_VALUE);
        
        System.out.println("min long value: " + Long.MIN_VALUE);
        System.out.println("max long value: "+ Long.MAX_VALUE);

        int i2 = (int) 2147483648l;
        long l1 = 2147483648l;

        char c1 = 'a';
        char c2 = '阿';
        char c3 = 65;
        char c4 = '\u2323';

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }

        char cdif = 'z' - 'a';
        System.out.println("cdif = " + (int)cdif);

        for (char c = '阿'; c < '阿' + 100; c++) {
            System.out.println(c);
        }

        System.out.println("min char value: " + (int)Character.MIN_VALUE);
        System.out.println("max char value: " + (int)Character.MAX_VALUE);

        float f1 = 0.5f;
        float f2 = .5f;
        float f3 = 1.f;
        float f4 = 1e10f;
        float f5 = 1e-10f;
        float f6 = 0.12345678901234567890f;
        System.out.println("f6 = " + f6);

        double d1 = 0.5;
        double d2 = 0.123456789012345678901234567890;
        System.out.println("d2 = " + d2);

         boolean bl1 = true;
         boolean bl2 = false;
    }
    
}
