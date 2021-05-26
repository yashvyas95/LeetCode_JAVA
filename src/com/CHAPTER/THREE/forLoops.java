package com.CHAPTER.THREE;

import java.util.ArrayList;
import java.util.Collection;

public class forLoops {
    Object o = null;
    Collection c = new ArrayList();
    int[][] ia = new int[1][];

    public void forLoopsMethod() {
        for (final var o2 : c) {
        } //  FINAL VARIABLES ARE ALLOWED IN FOR LOOPS
    }

    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        for (var i = 0; i <= 3; i++) {
            k++;
            if (i == 2) {
                //break;
                //continue;
                i = 4;
                //LINE 1
                //LINE 1----- BREAK; -> will produce 3,2
                //LINE 1----- CONTINUE; -> will produce 4,3
                //Line 1----- i=4; -> will produce 3,3
            }
            m++;
        }
        System.out.println(k + " , " + m);
    }

}
