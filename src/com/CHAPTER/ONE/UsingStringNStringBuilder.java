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
        classObj.stringBuilderConcat();
    }
}
