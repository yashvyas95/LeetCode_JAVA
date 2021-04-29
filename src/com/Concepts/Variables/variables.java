package com.Concepts.Variables;

/*
    There are three types of variables in JAVA:
    1. Local Variables
    2. Instance Variables
    3. Static Variables

    Local Variables :
        Def: A variables defined within a block or method or constructor is called Local Variable.
        NOTE: INITIALISATION OF LOCAL VARIABLE IS MANDATORY.

    Instance Variables :
        Def: Instance variables are non-static variables and are declared in class outside
             any method, constructor or block.
        NOTE:
             1. DECLARED IN A CLASS. CREATED WHEN OBJECT OF CLASS IS CREATED,
                DESTROYED WHEN OBJECT IS DESTROYED.
             2. UNLIKE LOCAL VARIABLES, ACCESS SPECIFIERS CAN BE APPLIED.
                DEFAULT ACCESS SPECIFIER WILL BE APPLIED IF NOT USER APPLIED.
             3. INITIALISATION OF INSTANCE VARIABLE IS NOT MANDATORY.
                DEFAULT VALUE IS 0.
             4. CAN ONLY BE ACCESSED BY CREATING OBJECTS.

    Static Variables :
        Def: Static variables are also known as Class variables.

        NOTE:
            1. DECALRED SIMILARLY AS INSTANCE VARIABLES,
               THE DIFFRENCE IS THAT STATIC VARIABLES ARE DECLARED USING:
               STATIC KEYWORD : WITHIN CLASS OUTSIDE ANY METHOD CONSTURUCTOR OR BLOCK.
            2. UNLIKE INSTANCE VARIABLES, WE CAN ONLY HAVE ONE COPY OF STATIC VARIABLE PER
               CLASS IRRESPECTIVE OF HOW MANY OBJECTS WE CREATE.
            3. STATIC VARIABLES ARE CREATED AT THE START OF PROGRAM EXECUTION AND DESTROYED
               AUTOMATICALLY WHEN EXECUTION ENDS.
            4. INITIALISATION OF STATIC VARIABLES IS NOT MANDATORY, DEFAULT VALUE IS 0
            5. IF WE ACCESS THE STATIC VARIABLES LIKE INSTANCE VARIABLES,
               COMPILER WILL SHOW WARNING MESSAGE AND IT WON"T HALT THE PROGRAM.
               COMPILER WILL REPLACE THE OBJECT NAME TO CLASS NAME AUTOMATICALLY.
            6. IF WE ACCESS THE STATIC VARIABLE WITHOUT CLASS NAME, COMPILER WILL
               AUTOMATICALLY APPEND THE CLASS NAME.



 */


public class variables {

    int instanceVariables;
    static int staticVariable;

    public void localVariables() {
        int age = 1;
        System.out.println(age);
    }

    public void instanceVariables() {
        System.out.println("Instance Variables " + instanceVariables);
    }

    public static void staticVariable() {
        System.out.println("Static Variables " + staticVariable);
    }

    public static void main(String[] args) {
        variables v = new variables();
        v.instanceVariables();
        v.localVariables();
        staticVariable();

    }
}
