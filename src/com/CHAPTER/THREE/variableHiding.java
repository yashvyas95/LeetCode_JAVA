package com.CHAPTER.THREE;

public class variableHiding {
    int x = 5; //INSTANCE VARIABLE

    int getX() {
        return x;
    }

    public static void main(String[] args) {
        variableHiding classObj = new variableHiding();
        classObj.looper();
        System.out.println(classObj.x);
    }

    public void looper() {
        var x = 0; // HERE NOTE THAT INSTANCE VARIABLE X IS HIDDEN BY X IN LOOPER
        //X can be known as LOCAL VARIABLE OR AUTOMATIC VARIABLE
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
            }
        }
    }
}
