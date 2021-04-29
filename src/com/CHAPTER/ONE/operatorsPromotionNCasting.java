package com.CHAPTER.ONE;

/*
        1. * , / , % can have same level of precedence.
        2. & can have integral as well as boolean operands.
        3. ! , && , || can operate only on boolean operands.
        4. ~ can opearate only on integral types.
        5. . OPERATOR HAS HIGHER PRECEDENCE THAN CASTING

    VALID  OPEARATORS : ! , ~ , & , %=

 */

/*
        RULES FOR CASTING PRIMITIVES:

       1. ANYTHING BIGGER THAN an INT can NEVER BE ASSIGNED to AN INT or
          ANYTHING SMALLER THAN INT without explicit cast.

       2. CONSTANTS values up to int can be assigned [without cast].
            values should be fittable in INT

       3. Operands of MATHEMATICAL OPERATORS ARE ALWAYS promoted to ATLEAST int.

       4. COMPOUND assignment operaotrs (+=,*= etc) have strange ways
       EXAMPLE:
        short x = 3;
        x+= 4.6
        // as implicitly x = (short) (x+4.6)
        // Therefore x = 7;
 */


public class operatorsPromotionNCasting {

    public void modulusOperatorCanBeUsedWith() {
        float f = 1.0f;
        int a = 2;
        System.out.println(f % a);
        System.out.println(a % f);
    }

    public void validCasting() {
        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;
        i = b + b;
        s *= b;
        s += i;
        // c=c+b; COMPILE TIME ERROR
        // s=b*b; COMPILE TIME ERROR

    }

    public void realBrainer() {
        boolean b1 = false;
        boolean b2 = false;

        /*
            if( b2 != b1 = !b2)
            NOTE BOOLEAN OPERATORS HAVE MORE PRECEDENCE THAN =.
            first
            (b2!=b1) => false;
            false=!b2 => ILLEGAL BECAUSE FALSE IS VALUE AND B2 iS VARIABLE
         */
        //if( b2 != b1 = !b2){
        if (b1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        operatorsPromotionNCasting classObj = new operatorsPromotionNCasting();
        classObj.modulusOperatorCanBeUsedWith();
    }
}
