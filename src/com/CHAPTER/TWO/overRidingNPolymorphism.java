package com.CHAPTER.TWO;

public class overRidingNPolymorphism {
    public static void main(String[] args) {
        Parent classObj = new Child();
        System.out.println(classObj.h + " " + classObj.getH());
        Child cc = (Child) classObj;
        System.out.println(cc.h + " " + cc.getH());
    }
}

class Parent {
    public int h = 4;

    public int getH() {
        System.out.println("Parent " + h);
        return h;
    }
}

class Child extends Parent {
    public int h = 8;

    public int getH() {
        System.out.println("Child " + h);
        return h;
    }
}