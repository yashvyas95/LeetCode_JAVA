package com.CHAPTER.ONE;

public class UsingStringNStringBuilder {

    public void stringThrowingSTRINGIndexOutOfBound() {
        System.out.println("12345".charAt(6));

        /*
              INDEX_OUT_OF_BOUNDS EXCEPTION:
                    IF BeginIndex < 0
                    IF endIndex > BeginIndex
                    IF BeginIndex > STRING.length
         */
    }

    public void stringISIMMUTABLE() {
        String abc = "";
        abc.concat("abc");
        abc.concat("def");
        System.out.println("STRING IS IMMUTABLE " + abc);
    }

    public void stringMethods() {
        String s = new String("     HELLO STRING FOR METHOD CHECKING   ");

        System.out.println("STRING .isBlank " + s.isBlank());
        System.out.println("STRING s.strip " + s.strip());
        System.out.println("String .isEmpty " + s.isEmpty());
        System.out.println("String .stripLeading " + s.stripLeading());
        System.out.println("Strubg .stripTrailing " + s.stripTrailing());
    }

    public void someMoreStringMethods() {
        String s = new String("abc");
        s.repeat(2);
        s.equalsIgnoreCase("abc");
        s.intern();
        /*
            INTERN() METHOD
            Returns: A canonical representation for the string object.
            A pool of strings, initially empty, is mainted privately by string class.
            When intern is invoked -> if pool already contains a string equal to
                    String object as determined by equals(obj) method,
                    then that string is returned.
                    Otherwise string object is added to the pool and reference is returned.

            String returned will have same contents as string invoked on.
            but is guranteed to be from a pool of unique strings.
         */
        s.compareTo(s);
        System.out.println(s);
    }

    public void stringBuilderConcat() {
        System.out.println(new StringBuilder("world").insert(0, "hello "));
    }

    public void stringBuilderWithCapacity() {
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb1 = new StringBuilder();
        sb1.ensureCapacity(100);
    }

    public static void main(String[] args) {

        UsingStringNStringBuilder classObj = new UsingStringNStringBuilder();

        //  classObj.stringThrowingSTRINGIndexOutOfBound();
        //  classObj.stringISIMMUTABLE();
        //  classObj.stringMethods();
        //   classObj.stringBuilderConcat();

        classObj.someMoreStringMethods();
    }
}
