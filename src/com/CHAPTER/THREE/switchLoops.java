package com.CHAPTER.THREE;

public class switchLoops {
    public void switchCASES() {
        long l = 1l;
        char c = 1;
        String s = "1";
        int a = 1;
        //switch (l){} LONG CANNOT BE USED IN SWITCH CASES
        /*
            NOTE 1: ONLY STRING, BYTE, CHAR, SHORT, INT
                 2. ALL CASE CONSTANTS MUST BE ASSIGNABLE TO SWITCH VARIABLE
                 3. NO TWO CASE STATEMENTS CAN HAVE SAME VALUE.
                 4. AT MOST ONE DEFAULT LABEL CAN be DECALRED.
                 5. EMPTY SWITCH BLOCK IS VALID CONSTRUCT.
         */


        switch (a) {
            case 1:
                break;

//            case 1.0 : break; // HERE 1.0 IS NOT ASSIGNABLE TO INTEGER
            default:
                break;
        }
    }

    public void someSWTICHGOODQ1() {
        LOOP:
        for (int i = 0; i < 5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B");
                    break LOOP;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                case 'E':
                    System.out.println("F");

            }
        }
    }

    public static void main(String[] args) {
        switchLoops classObj = new switchLoops();
        classObj.someSWTICHGOODQ1();
    }
}
