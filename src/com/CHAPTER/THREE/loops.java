package com.CHAPTER.THREE;

public class loops {

    public void validInsideMethod() {
        /*
        do{
            break;
        }
        while(true);
        */

        switch (1) {
            default:
                break;
        }

        for (; true; ) break;

        /*
                NOTE::
                1. IT IS NOT POSSIBLE TO BREAK OUT OF IF STATEMENT,
                   THEREFORE "IF" STATEMENT INSIDE SWITCH OR LOOP CAN USE
                   BREAK; else NOT.

                EX:  VALID
                       label : if(true){
                               System.out.println("Break LABEL");
                               break label;
                       }
         */
    }

}
