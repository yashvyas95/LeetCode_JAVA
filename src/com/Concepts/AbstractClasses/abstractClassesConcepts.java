package com.Concepts.AbstractClasses;

public class abstractClassesConcepts {

    ///************** IMP CONCEPT SUBCLASSES OVERRIDING WHICH METHOD METHOD EVERYWHERE****************////////////////////
    static class one{
        class Bird{
            public String getName(){ return null; }
            public void printName(){
                System.out.println(getName());
            }
        }
        class Stork extends Bird{
            public String getName(){ return "Stork!"; }
        }
    }
    /*
    public static void main(String[] args){
        one.Stork s = new one().new Stork();
        System.out.println(s.getName());
        one.Bird b = new one().new Stork();
        System.out.println(b.getName());

        two.Stork stork2 = new two().new Stork();
        System.out.println(stork2.getName());



    }
    */
    public static void main(String[] args){
        three.BlackRhino b = new three().new BlackRhino();
        b.eat();
        b.showHorn();
    }
    /*** NOW SAME CLASS WITH ABSTRACT USAGE    ********//////////

    static class two{
        abstract class Bird{
            public abstract String getName();
            public void printName(){
                System.out.println(getName());
            }
        }

        class Stork extends Bird{
           public String getName(){ return "Stork!"; }
        }
    }

    /**********Inheritance using abtract classes*********///////
    // In following case abstract can implement ZERO or MORE methods of Subclasses without error
     static class three{
        abstract class Mammal{
            abstract void showHorn();
            abstract void eat();
        }
        abstract class Rhino extends Mammal{
            void showHorn(){
                System.out.println("Show Horn RHINO");
            }
            void eat(){}
        }
        class BlackRhino extends Rhino{
            void eat() {
                System.out.println("In Black-Rhino Eat");
            }
        }
    }

}
