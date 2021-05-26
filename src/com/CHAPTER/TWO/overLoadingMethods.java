package com.CHAPTER.TWO;

import java.util.*;

/*
    1. Overriding method must have same return type in case of primitive.
        [ A subClass is allowed in case of classes ]
        and the parameter list must be same.
        [ Just the Type of parameter is important ]

    2.  The overRiding method can throw a subset of the exception or subclass
        of exceptions thrown by over-ridden class.
        Having no throws clause is also valid since an empty set is a valid subset.

 */


public class overLoadingMethods extends AmazingClass {
    void amazingMethod(List l) {
        System.out.println("LIST");
    }

    public static void main(String[] args) {
        List<String> aList = new ArrayList<String>();
        Collection<String> aCollection = aList;
        AmazingClass classObj = new overLoadingMethods();
        classObj.amazingMethod(aList);
    }
}

abstract class AmazingClass {
    void amazingMethod(Collection c) {
        System.out.println("COLLECTION");
    }
}
