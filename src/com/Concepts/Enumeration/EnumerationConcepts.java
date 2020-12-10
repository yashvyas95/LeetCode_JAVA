package com.Concepts.Enumeration;

public class EnumerationConcepts {
    public static class one {
        public enum Days {MON, TUE, WEN};
        public void method() {
            for (Days d : Days.values()) {
                Days[] d2 = Days.values();
                System.out.println(d2[2]);
            }
        }
    }

    public static class two {
        enum Animals {
            DOG("Woof"), CAT("Meow"), FISH("No Sound please");
            String sound;

            Animals(String s) {
                sound = s;
            }
        }
        static Animals a ;
        public static void main(String[] args){
            System.out.println(a.DOG.sound+ "" + a.FISH.sound);
            System.out.println(Animals.values().toString());
        }
    }
}
