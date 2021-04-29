package com.CHAPTER.ONE;

public class UsingPrimitiveAndWrapperClasses {

    public static void main(String[] args) {

        UsingPrimitiveAndWrapperClasses a = new UsingPrimitiveAndWrapperClasses();

        //q-1
        a.conversion();

        //q-2
        System.out.println(a.parseFloat("-Infinity"));//1.
        System.out.println(a.parseFloat("+Infinity"));//2.
        System.out.println(a.parseFloat("junk"));//3

        //q-3
        a.usingUNDERSCORE();
    }

    //Q-1
    public void conversion() {
        int i = 1234567890;
        float f = i;
        System.out.println(i - (int) f);//NOTE WILL NOT PRINT ZERO.
        //DUE TO LOSS IN CONVERSION
    }

    //Q-2
    public float parseFloat(String s1) {
        try {
            return Float.parseFloat(s1);
        } catch (NumberFormatException e) {
            return 0.0f;
        } catch (IllegalArgumentException e) {
            return Float.NaN;
        }
    }

    //Q-3
    public void usingUNDERSCORE() {
        double d = 10_000_000;
        System.out.println("Using UnderScore " + d); // WILL PRINT 1.0E7
             /*
                CANNOT BE USED LIKE
                100_
                _100
              */

        int hex = 0xCAFE_BABE;
        float f = 9898_7878.333_333f;
        int bin = 0b1111_0000_1100_1100;
    }

    //Q-4
    public void floatDeclaration() {

        //float f1 = 1.0; // DOUBLE VALUE PROVIDED COMPILE TIME ERROR
        //float f2 = 43e1; // DOUBLE VALUE PROVIDED COMPILE TIME ERROR
        float f3 = -1;
        float f4 = 0x123;
        float f5 = 4;
        float f6 = 4f;
    }
}
