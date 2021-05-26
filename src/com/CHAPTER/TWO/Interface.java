package com.CHAPTER.TWO;

/*
    INTERFACE:

    NOTE: 1. CAN HAVE PRIVATE CONSTRUCTOR.
    NOTE: 2. CAN ACCESS THE NON-STATIC MEMBERS OF CLASS.

 */
public class Interface {

    interface InterfacesVariablesImplicityAccessor {
        public int A = 1;
        int B = 1;
        //private int c = 1; // PRIVATE VARIABLE ARE NOT ALLOWED IN INTERFACES.
        static int c = 1;
        final int d = 1;
        public static int E = 1;
        public final int F = 1;
        static final int G = 1;
        public static final int H = 1;
    /*
            REMEMBER ALWAYS
            ANY FIELDS IN AN INTERFACE
            is implicitly
            public, static , final
     */

        public int getA(); // INSTANCE METHOD

        public static int getB() {
            return B;
        } //STATIC METHOD

        private void helper() {
        } // REMEMBER INTERFACE CAN HAVE PRIVATE METHODS
    }


    public static void main(String[] args) {
        house h = new HomeOffice();
        System.out.println(h.getAddress());
    }
}

interface house {
    public default String getAddress() {
        return "101 House Address";
    }
}

interface office {
    public default String getAddress() {
        return "101 Office Address";
    }
}

class HomeOffice implements house, office {
    public String getAddress() {
        return "101 HomeOffice Address";
    }
}
