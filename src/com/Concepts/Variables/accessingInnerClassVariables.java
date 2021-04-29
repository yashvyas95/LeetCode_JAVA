package com.Concepts.Variables;

/*
 WE WANNA PRINT X ON STANDARD OUTPUT.
 */
public class accessingInnerClassVariables {
    String a = "x";
    static char b = 'x';
    String c = "x";

    class Inner {
        String a = "y";

        String get() {
            String c = "temp";

            //1.
            c = accessingInnerClassVariables.this.a;
            //2.
            c = "" + accessingInnerClassVariables.b;
            //3.
            c = "" + b;
            return c;
        }
    }

    accessingInnerClassVariables() {
        System.out.println(new Inner().get());
    }

    public static void main(String[] args) {
        new accessingInnerClassVariables();
    }
}
