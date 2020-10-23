package com.Cerification.Questions;

import java.util.function.*;
import java.io.BufferedWriter;
import java.util.*;
import java.sql.*;
import java.util.stream.Stream;

/*
public class Questions {
    private Date rob = new Date();
    private java.util.Date sharon = new java.util.Date();

}

public class A{
    private int counter = 0;
    public static int getCount()
    {
        return counter;
    }
    public A(){counter++;}
}
public class Questions {
    int birds = 10;
    public static void main(String args[]){
        int trees = 5;
        System.out.println(trees+birds);
    }
}
public class Questions {
    public static void main(String args[]) {
        String trees = "pine";
        int count = 0;
        if (trees.equals("pine")){
            int height = 55;
            count = count+1;
        }

        System.out.println(height+count);
    }
}
public class Questions{
    private boolean numlock = true;
    static boolean caplock = false;

    public static void main(String... shortcut){
        System.out.println(numlock+caplock);
    }
}

public class Questions{
    String color = "red";
    private void printColor(String color){
        color = "purple";
        System.out.println(color);
    }
    public static void main(String[] args){
        String chair , table = "metal";
        //new Questions().printColor("blue");
        int d1 ;
     //   System.out.println(d1);
    }


public class Questions{
    String[] args = {"Yipeee2","a","b","c"};
    public static void main(String[] args){
        for(int x = 1 ; x < args.length ; x++){
            System.out.println(args[x]+ " ");
        }
    }


interface TestA{String tomethod();}
*/
 /*
    public static void main(String[] args){
       // System.out.println(Enum.Example.ONE == Example.ONE);
       //Enum.Example e = Enum.Example.ONE;
        //int $agee = 10;
        //int #name = 10;
        new three();
    }}
    class one{public one() {
        System.out.println(1);
    }}
    class two extends one{public two() {
        System.out.println(2);
    }}
    class three extends two{public three() {
        System.out.println(3);
    }}

    // public static class Enum{public enum Example{ONE,TWO,THREE}}


    class Animal{public String noise(){return "peep";}}
    class Dog extends Animal{public String noise(){return "bark";}}
    class Cow extends Animal{public String noise(){return "MOOH";}}

    public static void main(String[] args){
        Animal a = new Dog();
        Cow c = (Cow)a;
        System.out.println(c.noise());
    }
}

        public static void main(String[] args){
            System.out.println(new TestA(){
                @Override
                public String tomethod() {
                    return "Test";
                }
            });
        }
}*/
//public void doit(){}
// public static int doit(){return 0;}
// public Integer doit(){return 10;}
    /*
    public static void main(String[] args){

        int x = 4;
        StringBuffer sb = new StringBuffer("..fedcba");
        sb.delete(3,6);
        sb.insert(3,"az");
        if(sb.length() > 6) x = sb.indexOf("b");
        sb.delete((x-3),(x-2));
        System.out.println(sb);
    }

     */
public class Questions {

    int age;
    /*
    private static void check(Questions questions, Predicate<Questions>pred){
        String result = pred.test(questions) ? "True" : "False";
        check((h,m)-> h.append(m).isEmpty(),5);
        System.out.println(result);
    }

     */
    private static void check(Climb climb,int height){
        ArrayList<Integer> l = new ArrayList<Integer>();

        if(climb.isTooHigh(height,10))
            System.out.println("TOO High");
        else
            System.out.println("OK");
    }
    static void append(int number){

    }
    /*
    public static void main(String[] args){
     //   Stream nums = Stream.of(1,2,3,4,5);
     //      Questions p1 = new Questions();
     //   p1.age = 1;
     //   check(p1, p->p.age < 5);
        check((h,m) -> h.append(m).isEmpty(),5);
        ArrayList<String> l1 = new ArrayList<>();
        l1.removeIf((e)->{"Poof"}
        );
        //l1.removeIf((s1,s2)->s1.isEmpty());
    }

     */
    public static void main(String[] args){
        List a = List.of(1,2,3);
        Map  a2 = Map.of(1,2,3,4);
        Set a3 = Set.of(1,2,3);
        a.forEach(x-> System.out.println("LIST VALUES"+x));
        a2.values().forEach(x-> System.out.println("MAP VALUES"+x));
        a3.forEach(x-> System.out.println("SET VALUES"+x));
    }
    public void method(){
        x((var x)->{},(var x , var y)->0);
    }
    public void x(Consumer<String>x,Comparator<Boolean>y){}
}


class Panda{
    int age;
    private static void check(Panda panda, Predicate<Panda>pred){
        String result = pred.test(panda) ? "True" : "False";
        System.out.println(result);

    }
}

interface Climb {
    boolean isTooHigh(int height, int limit);
}

