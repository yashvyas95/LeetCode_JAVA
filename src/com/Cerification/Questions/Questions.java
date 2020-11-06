
package com.Cerification.Questions;

import com.sun.jdi.DoubleValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.function.*;
import java.io.BufferedWriter;
import java.util.*;
import java.sql.*;
import java.util.stream.Stream;
import java.util.Date;
import java.sql.*;

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
    public static void main(String[] args) {
        try {
            Questions q1 = new Questions();
            q1.remove(List.of('z', 'c', 'z'));
        } catch (Exception e) {
        }
        Set<String> set = Set.of("lea", "leo");
        List<String> list = new ArrayList<>();
        list.add("lea");
        list.add("leo");
        //set.forEach(s-> System.out.println("ITS SET "+s));
        list.sort((c1, c2) -> c1.compareTo(c2));
        list.forEach(s -> System.out.println("ITS LIST " + s));
        Consumer<Set<Double>> c1 = x -> Set.of(1.23);
        Predicate<Set<Float>> c2 = x -> true;
    }
    public static void main(String[] args) {
        for(int i = 0 ; i < 3 ; i++){
            if(i%2==0){
                Supplier<Integer> s1 = () -> 3;
                System.out.println("Supplier in IF BLOCK"+s1.get());
            }
            else{
                int j = i;
                Supplier<Integer> supplier = ()->j;
                System.out.println("Supplier-----ELSE-------"+supplier.get());
            }
            (String a,String b)->{a+b;};
        }
    }
    private static void check(Questions questions, Predicate<Questions>pred){
        String result = pred.test(questions) ? "True" : "False";
        check((h,m)-> h.append(m).isEmpty(),5);
        System.out.println(result);
    }
     public static void main(String[] args) {
        Object obj = Integer.valueOf(4);
        String str = (String) obj;
        obj = null;
        System.out.println(obj.equals(null));
      //  FileReader r = new FileReader("");
        Locale
        try{
        throw new IllegalArgumentException();
            FileReader r = new FileReader("");
            Integer.parseInt("name");
        }
        catch(Exception e ){

        }
        catch(ArithmeticException e){}
        finally {

        }

    }    }
    public void method(){
        x((var x)->{},(var x , var y)->0);
        remove(List.of('d'));
    }
    public void x(Consumer<String>x,Comparator<Boolean>y){}
    public void remove(List<Character>chars){
        char end = 'z';
        chars.removeIf(c->{
            char start = 'a';return start <= c && c <= end;});
            char c = 'x';
            chars = null;
            char start = 'a';


    }
    public void y(Predicate<String>pred){}
    public void y_test(){
        y((StringBuilder s)->s.isEmpty());

    }
}
*/
/*
public class Questions {
    static long birds ;
    private static int fixed = 10;
    private static Questions q;
    void error(){}
    private boolean x = false;
    String color = "red";
    private void color(String color){
        color = "purple";
        System.out.println("CCCCCC"+color);
    }
    Integer integer = new Integer(4);
   String cat = "animal",dog = "animal";
    {cat = "dpf";}
    public static void main(String[] args ){
        int extra,y=1;
        String chair;
        double d=3.14;
      // Double d1 = new double(10_00_0);
        System.out.println("Birds"+birds);
        float f = 5.0f;
    }
   // public String convert(int value){return value.toString();}
    public String convert(Integer value){return value.toString();}
    public String convert(Object value){return value.toString();}
}
*/
public class Questions {
    public String first = "instance";
    static double defualtvalue;
    static int dde;
    static long dde2;
    static short dde3;


    public Questions() {
      super();
    }
    public void choose(){
        System.out.println("VOID");
    }
    private static int choose(){return 2;}
    public int choose(long choice){return 11;}

    interface aa {
      // void print(){};
        final int q = 19;
        protected int q1 = 19;
        abstract int q = 10;
        static int q2 = 0;
        public int q3 = 0;
    }
    interface b implements aa{}
    //public int $asdb(int e ){return 0|;}
    public static void main(String[] args){
        System.out.println(new Questions().choose((byte)2+1));
    }
    abstract class c { abstract protected void n();
    }
    class d extends c{}

    public void Questions() {}

    {
        first = "block";
    }

    public void print() {
        //System.out.println(first);
        System.out.println("PLAY--");
    }

    public void finalizer() {
        System.out.println("Clean-");
        double w = 0.2;
    }

    public void calculateResult(Integer canA, Integer canB) {
        boolean process = canA == null || canA.intValue() < 10;
        //boolean value = canA && canB;

    }
    /*
    public static void main(String[] args){
        //long th = 5 >= 5 ? 1+2 : 1*1;
        //if(++th < 4){th+=1;}
        //System.out.println("-------"+th);
        boolean x = false,y=false;
        int j = 4;
        int j1 = 11;
        int dog = 11;
        int cat = 3;
        int partA = dog/cat;int partB = dog%cat;
        int newdog = partB + partA * cat;
        System.out.println("NEW DOG "+newdog);
       // String dinner = (j1 > 10 ? j ? "TakeOut" : "Salads" : "LeftOVers");
       // System.out.println("DINERR "+dinner );
        //System.out.println("PRE ++x "+ ++jump);
       // System.out.println("PRE x++ "+ jump2++);
       // System.out.println("PRE --y "+ --jump3);
       // System.out.println("PRE y-- "+ jump4--);
        int leaders = 10*(2+(1+2/5));
        int followers = leaders*2;
  //      System.out.println(leaders+followers<10 ? "Too Few" : "Too MANY");
        System.out.println(5+6+"7"+8+9);
       // System.out.println("6 % 3"+(6%3));
        }

}
     */

    /*
    public final static void main(String... args){
        int x = 10, y = 5;
        boolean w = true, z = false;
        x = w ? y++ : y--;
        w = !z;
        System.out.println((x+y)+" "+(w?5:10));
        /*
        int eaten = 0;

        switch(flavors){
            case 30: eaten++;
            case 40: eaten+=2;
            defualt: eaten--;
        }
        System.out.println("EATEN "+eaten);

        public static String[] args = {"Bob","Logic"};
    public static void main(String... args){
        String bob = new String("ORIGINAL");
        String notbob = bob;
        System.out.println("Bob == Notbob "+ bob== notbob);
        System.out.println(" Bob.equals(notbob) = "+bob.equals(notbob));
        if(args.length >=1 && (args[0].equals("sound")) || args[0].equals("Logic")&& args.length<2){
            System.out.println("Answer Line "+args[0]);
        }
        /*
        []double lion;
        double[] lion2;
        double bear[];

    public static void main(String... args){
        Questions q = new Questions();
        q.printName("Arlene");
        q.printName(new String[]{"BRET"});
     //   q.printNames("ARLENE");
        q.printName(new String[]{"BRET2"});
        int[][] doubleArray = new int[2][2];
        System.out.println();
        String[] numx = {"1","9","10"};
        Arrays.sort(numx);
        char[][] a = new char[3][3];
        String[] lion = new String[]{"Lion"};
        String[] lion3 = new String[]{};
        [][] String aplha;
        [] String beta;
        String[][] gamma;
        String[] delta;
        String epiliso[][];
        float[] lion2 = new[1] float;

        System.out.println(Arrays.toString(numx));
    }


    static int[][] game = new int[6][6];
    public static void main(String... args){
        String[] days = {"Mac","Linux","Windows"};
        boolean[][][] bools,morebools;
        bools = new boolean[1][1][1];
       // System.out.println(bools[1][1][1]);
        String[] a = new String[2];
        System.out.println(a);
        //String... s = args;
        game[3][3] = 2;
        Object[] o = game;
      //  o[3] = "X";
      //  System.out.println(game[3][3]);
        Arrays.sort(days);
        System.out.println(Arrays.binarySearch(days,"RedHat"));
        System.out.println(args[0]);
    }


    public static void main(String[] args){
        int[] uums[]  = new int[2][1];
        int[] nms[] = new int[][]{{0},{0}};
        int[] nn[] = new int[][]{{0,0}};
        System.out.println("Ss");
    }

     */
/*
    public static void main(String[] args){
        String[] days = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
        for (int o = 0 ; o <= days.length ; o++){
            System.out.println(days[o]);
        }
        String[][] d = new String[2][2];
        System.out.println(args.length);
    }




    static int[][] game;
    public static void main(String[] args){
        String[][] listing = new String[][] {{"Book"},{"Game","29.9"}};
//        System.out.println(listing.length + " " + listing[0].length);
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(i);
            if(i == 1)
                break;
                System.out.println("In CONTINUE");

        }

    }

    public static void main(String[] args){
        List<String> drinks = Arrays.asList("can","cup");
        for(int i = drinks.size()-1;i>=0;i--){
            System.out.println(drinks.get(i));
        }
        String l = "";
        while(l.length() != 2)
            l+='a';
        System.out.println(l);
        for(int i  = args.length ; i>=0 ; i++){
            System.out.println("args");
        }

    }

 */
    private static int counter;
    private static String[] con = new String[]{"Washington","Monroe","C"};
    /*
    public static void main(String[] args) {
        while (counter < con.length) {
            if (con[counter++].length() < 8) {
                break;
            }
        }
        System.out.println(counter);
        do {
            int count = 0;
            do {
                count++;
            } while (count < 2);
            break;
        } while (true);
        for( ;i=0;i++){
            System.out.println("Inside");
        }

    }
    public static void main(String[] args){

        do{
            System.out.println("INside");
        }while(false);

        int singer = 0;
        while(singer>0){
            singer++;
            System.out.println("Singer");
        }

       // ArrayList<Integer> taxis = new ArrayList<>();
        StringBuilder ber = new StringBuilder();
        int[] taxis = new int[1];
        String letters = "";
        while(letters.length()!=3){
            letters+="ab";
        }
        System.out.println("letters "+letters);
    }


    private static int count;
    //private static String[] = new String[] {"Washington","Monroe","Jackson","LaSalle"};
    public static void main(String[] args) {
        String n = null;
        StringBuilder br = new StringBuilder();
        String str = new String("Leaves growing");
        //do{}while(builder);
        boolean x = false;
      do{
          if(!x){
              x=true;
              System.out.println("Inflate-");
          }
      }while(x);
        System.out.println("DOne");
        int i=0 , j = 0;

    }

     */
    public int nested(){ return nested(2,true);}
    public int nested(int a){return nested(a,true);}
    public int nested(int a , boolean b){return a+1;}
    void Go_$Outside$2(){}

    public final static int getNumber(){
        return 3;
    }
/*
    private final Object contents;
    protected Object getContents(){return contents;}
    protected void serContents(Object contents){this.contents = contents;}
    protected void showContents(){
        System.out.println("Your Gift: "+contents);
    }

    public static void main(String[] args){
        Questions q = new Questions();
        System.out.println(q.nested());
    }

 */
    private int inThe = 4;
    final protected int s = 4;
   // private static final String Monday;
    public void stars(){
      //  super();
    }


    public void printName(String... args){
        System.out.println(Arrays.toString(args));

    }
    public void printNames(String[] arra){
        System.out.println(Arrays.toString(arra));
    }
}



class Ski{
    private int age;
    public int age2 = 10;
    private Date rob = new Date();
    private java.util.Date shalom = new java.util.Date();

    private static void salom(Ski racer,int[] speed, String name){
        racer.age = 18;
        name = "Wendy";
        speed = new int[1];
        speed[0]=11;
        racer = null;
    }
    private static void check(Climb climb, int height) {
        ArrayList<Integer> l = new ArrayList<Integer>();

        if (climb.isTooHigh(height, 10))
            System.out.println("TOO High");
        else
            System.out.println("OK");
    }
    static void append(int number) {

    }
    public void nested(){nested(2,true);}
    public int nested(int level,boolean condi){return nested(2);}
    public int nested(int level){return level+1;}
    public int compute(){return 10;}
  //  private Date rob = new Date();
    private java.util.Date s = new java.util.Date();
/*
    public static void main(String[] args){
        final Ski mySkier = new Ski();
        mySkier.age = 16;
        final int[] mySpeed = new int[1];
        final String myName ="Rosie";
        salom(mySkier,mySpeed,myName);
        final int check = 1;
        skichile chile = new skichile();
        System.out.println(chile.age2);
        System.out.println(myName.equals(null));
        if(true){
            System.out.println("1");
        }
        else if(true){
            System.out.println("2");
        }
        if(true){
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }
    }

 */
}
class skichile extends Ski {
    skichile(){
        super();
    }


}
class Panda {
        int age;

        private static void check(Panda panda, Predicate<Panda> pred) {
            String result = pred.test(panda) ? "True" : "False";
            System.out.println(result);

        }
    }
interface Climb {
        boolean isTooHigh(int height, int limit);

    }

