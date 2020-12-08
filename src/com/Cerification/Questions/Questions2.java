package com.Cerification.Questions;

import java.awt.*;
import java.awt.desktop.QuitEvent;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.function.*;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Questions2 {
    String header = null;
        public static void main(String[] args) {
            Stream<Boolean> hide = Stream.of(true,false,true);
            boolean found = hide.filter(b->b).allMatch();
            int k = 0;
            header = 1 ;
           // while(--k){}
        }
        Questions2 Questions2(){
        }
}




class e73{
    class Ballot{
        private String name;
        private int judgeNumber;
        private int score;

        public Ballot(String name, int number,int score){
            this.name = name;
            this.judgeNumber = number;
            this.score = score;
        }
        public String getName(){return this.name;}
        public int getScore(){return this.score;}
    }

}



class e72{
    public void method(){
        Stream<Integer> is = Stream.of(8,6,9);
        Comparator<Integer> c = (a,b) -> a-b;
        //is.sort(c)
    }
}



class e71{
    public void method(){
        LongStream stream = LongStream.of(9);
        stream.map(p->p).forEach(System.out::println);
    }
}

class e70{
    public static void eatDesert(Optional<String> opt){
      //  System.out.println(opt.get("No Dessert Today"));
    }
}
class e69{
    public void method(){
        IntStream ints = IntStream.empty();
        IntStream moreInts = IntStream.of(66,77,88);
        Stream.of(ints,moreInts).flatMapToInt(x->x).forEach(System.out::println);
    }
}



class e68{
    public void method() {
        Set<String> set = new HashSet<>();
        set.add("tire-");
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("wheel-");
        Stream.of(set,list,queue)
                .map(x -> x)
                .forEach(System.out::println);
    }

}

class e67{
    public void method(){
        Set<String> set = new HashSet<>();
        set.add("tire-");
        List<String> list = new ArrayList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("wheel-");
        Stream.of(set,list,queue).flatMap(x->x.stream()).forEach(System.out::println);

    }
}

class e66{
    public void method(){
        Stream<Boolean> bools = Stream.iterate(true,b->!b);
        Map<Boolean,List<Boolean>> map = bools.limit(1).collect(partitioningBy(b->b));
        System.out.println(map);
    }
}
class e65{
    public void method(){
        Stream<Character> stream = Stream.of('c','b','a');
      //  stream.sorted((String s,String t)->{s.length()-t.length()}).findAny().ifPresent(System.out::println);
    }
}
class e64{
    public void method(){
        Stream s = Stream.of("hi");
        Consumer<String> print = System.out::println;
        s.peek(print).peek(print).map(s1->s1).peek(print).forEach(print);
    }
}
class e63{
    public void method(){
        Stream<String> s = Stream.of("Speak","bark","meow","growl");
        BinaryOperator<String> merge = (a,b)->a;
        Map<Integer,String> map = s.collect(toMap(String::length,k->k,merge));
        System.out.println(map.size()+ "   ----   "+map.get(4));
    }
}
class e62{
    public void method(){
        Stream<Character> chrs = Stream.of('o','b','s','t','a','c','l','e');
  //     chrs.map(c->c).collect(toMap());
    }
}
class e61{
    public void method(){
        IntStream a = IntStream.empty();
        System.out.println(a.average().getAsDouble());
    }
}
class e60{
    public void method(){
        Stream<String> stream = Stream.of("base","ball");
        stream.map(s->s.length()).forEach(System.out::print);
    }
}
class e59{
    public void method() {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
        boolean b = stream.anyMatch(i -> i > 5);
        System.out.println(b);
    }
}
class e58{

    class Tourist{
        public Tourist(double distance){this.distance = distance;}
        public double distance;
    }
     class Lifeguard{
        private void saveLife(Predicate<Tourist> canSave, Tourist tourist){
            System.out.println(canSave.test(tourist)?"Saved":"Toofar");
            new Lifeguard().saveLife(s->s.distance<4,new Tourist(2));
        }
    //    public final static void main(String... arfs){
    //        new Lifeguard().saveLife(s->s.distance<4,new Tourist(2));
    //    }
    }
}
class e57{
    public void method(){
        List<String>list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("San Francisco");

        long c = list.stream().filter(a->a.length()>10).count();

        System.out.println(c+" --- "+list.size());

      //  list.stream().forEach(System.out::println);
      //  list.stream().forEach(System.out::println);

    }
}
class e56{
    public void method() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.offer(3);
        a.offer(2);
        a.offer(4);
        System.out.println(a.stream().filter(n->n!=4));
    }
}
class e55{
    public void method() {
        List<String> s = new LinkedList<String>();
        s.add("a");
    }
}

class e54{
    public class News<Object>{}
}

class e53 {

    final public class Bottle {
        final private int size = 14;

        final protected class Insert {
            public final int getsize() {
                return Bottle.this.size;
            }
        }
    }
}

class e52{
    interface AddNumbers{
        int add(int a , int b);
        static int substract(int a , int b){return a-b;}
        default int multiply(int a, int b){return a*b;}
    }
    class Calculator{
        protected void calculate(AddNumbers a , int a1, int b1){
            System.out.println(a.add(a1,b1));
        }
    }
}
class e51{ enum Enum_Method_OverRideChecking{
    TRUE(10){@Override public String getNickName(){return "Right";}},
    FALSE(-10){public String getNickName(){return "False";}},
    UNKNOWN(0){@Override public String getNickName(){return "Lost";}};
    private final int value;
    protected abstract String getNickName();
    Enum_Method_OverRideChecking(int value){this.value = value;}
    public int getValue(){
        return this.value;
    }
}}
class e50{
    interface Alex{
        default void write(){}
        static void publish(){}
        void think();
    }
    interface Micheal{
        public default void write(){}
        public static void publish(){};
        public void think();
    }

    class Twins implements Alex,Micheal{
        @Override public void write(){}
//        @Override public static void publish(){}
        @Override public void think(){
            System.out.println("Thinking..." );
        }
    }
}


class e49{
    interface canBurrow{
        public abstract void burrow();
    }
    @FunctionalInterface interface HasHardShell extends canBurrow{}
    abstract class Tortoise implements HasHardShell{
        public abstract int toughness();
    }
    // class DesertTortoise extends Tortoise{
        public int toughness(){return 11;}
    }
class e48 {
    //interface Edible{void eat();}
    final class Oak{
        int water = 10 + 5;

        public int getWater() {
            return water;
        }
    }class Problems extends Exception{}
    abstract class Danger{ protected abstract void isDanger() throws Problems;

    }
}
class e47{
    public static class Ship{
        private enum Sail{
            TALL{protected int getHeight() { return 100; }},
            SHORT{protected int getHeight() { return 2; }};
            protected abstract int getHeight();
        }
        public Sail getSail(){return Sail.TALL;}
    }
}
class e46 {
    //Can Interface extened other Interface without putting method of parent class
    interface A {
        void method(double psi);
    }

    interface B extends A {
        void method2(double input);
    }
}
class e45{
    static class a{
        private enum sail{
            TALL {protected int getheight(){return 10;}},
            SHORT {protected int getheight(){return 5;}};
           // protected abstract getheight();
        }
    }
}
class e44{

    interface A{
        int Speed = 5;
        default int getSpeed(){return Speed;}
    }
    interface b{
        int Speed = 5;
        default int getSpeed(){return Speed;}
    }

     //class Questions2 implements A,b{
    class Questions2{
       // public static void main(String[] args) {
            class Inner extends Questions2 {
       //         @Override
                public int getSpeed() {
                    return 10;
                }
            }
       // }


    }

}
class e43{
    enum Dayoff{ Thanksgiving, PresidentDay, ValentineDay}
    public class Questions2 {
        private int level = 1;
        class Deep{
            private int level = 2;
            class Deeper{
                private int level = 3;
                public void printReality(){
                    System.out.println(level);
                    System.out.println(" "+Questions2.Deep.this.level);
                    System.out.println(" "+Deep.this.level);
                }
            }
        }
        public   void main(String[] args){
            Questions2.Deep.Deeper si = new Questions2().new Deep().new Deeper();
            si.printReality();
        }
    }
}
class e42{
    enum Dayoff{ Thanksgiving, PresidentDay, ValentineDay}
}
class e41{
    class Parent{
        void method(){};
    }
    class Child extends Parent{
        private void method(String s){};
    }
}
class e40{
    static{
        System.out.println("ANy");
    }
    {
        System.out.println("More");
    }

}
class e39{
    class parent{
         void method(){};
    }
    class child extends parent{
        public void method(){};
    }
}
class e38{
    class A {
        private String type = "Watch";

        public String getType(String suffix) {
            return type+suffix;
        }

    }
    class B extends A{
        private String type = "Smart Watch";
        public String getType(String suffix){return type+suffix;}
    }
}
class e37{
    static {
        System.out.println("INSIDE- STATIC");
    }
    private void drive(){
        System.out.println("Drive");
    }

}
class e36{
    class ExamAnswers {
        private  ExamAnswers instance = new ExamAnswers();
        private  List<String> answers = new ArrayList<>();
        private ExamAnswers() {}
        public ExamAnswers getExamAnswers() {
            return instance;
        }
        public List<String> getAnswers() {
            return answers;
        }
    }
    class TestAnswers {
        private  TestAnswers instance = new TestAnswers();
        private List<String> answers = new ArrayList<>();
        private TestAnswers() {}
        public  TestAnswers getTestAnswers() {
            return instance;
        }
        public List<String> getAnswers() {
            return answers;
        }
    }

}
class e35{private int number = new Random().nextInt(10);
    public boolean guess (int can){return number == can;}
}
class e34{
    static interface Vehicle{}
    static class Bus implements Vehicle{}
    public void method(String[] args) {
        Bus b = new Bus();
    //    System.out.println(b instanceof ArrayList);[ERROR]
        System.out.println(b instanceof Collection);
        System.out.println(b instanceof Vehicle);
        System.out.println(b instanceof Bus);
        System.out.println(null instanceof Bus);
    }

}
class e32{
    private static int integr;
    private int numrakes;
    public static int getNum(){return integr;}
    public  int getNum2(){return numrakes;}

}
class e31{
        public  void method(){
    parent p = new parent();}
     //   System.out.println(p.type);
    //    System.out.println(c.type);
      class parent{
        String type = "Parent";
    }
     class child extends parent{
        String type = "Child";
    }
}
class e30{
    interface Vehicle {}
    class Bus implements Vehicle {}
    public void main(String[] args) {
        Bus bus = new Bus();
        boolean n = null instanceof Bus;
        boolean v = bus instanceof Vehicle;
        boolean b = bus instanceof Bus;
        System.out.println(n + " " + v + " " + b);
    }

}
class e28{
    class Tool{
        void use(){}
    }
    class Hammer extends Tool{
    //    private void use(){}

    }
}
class e27{
    public void method(){
        LocalDate xmas = LocalDate.of(2016,12,15);

    }
}
class e26{
    public void method(){
        List<String> list = new ArrayList<>();
        list.add("-5");
        list.add("0");
        list.add("5");
        list.remove(4);
    //    print();

    }
    public static void print(List<String>list,Predicate<Integer>p){
        for (String num : list){
            if(p.test(Integer.parseInt(num))){
                System.out.println(num);
            }
        }
    }
}
class e25{
    public void method(){
        StringBuilder sb = new StringBuilder("12345");
        sb.substring(2);
        System.out.println(sb.charAt(1));
        String s = new String("11");
        StringBuilder ss = new StringBuilder();
       // s.replace(new String("aaaaa"));
        //ss.charAt()
       // ss.length()
    }
}
class e24{
    public void method(){
        LocalDate d1 = LocalDate.of(2017,1,1);
        Period period = Period.ofDays(1);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM-dd-YYYY");
        System.out.println(f.format(d1.minus(period)));
    }
}
class e23 {
    public void method() {
        Period period1 = Period.ofWeeks(1).ofDays(3);
        Period period2 = Period.ofDays(10);
        System.out.println(period1.equals(period2));
        System.out.println(period1.toString());
        System.out.println(period2.toString());
    }
}
class e22{
    public void method(){
        Predicate<String> dash = c-> c.startsWith("-");
        System.out.println(dash.test("-"));
        //Predicate<Integer> p = {return i->i!=0}
        LocalDate d = LocalDate.of(2012,12,25);
        d.plusDays(-1);
        System.out.println(d.getDayOfMonth());
    }
}
class e21{
    public void method(){
        //Predicate<String> pred = (String s) -> true;
        //System.out.println(pred);
        String one = new String("1");
        String two = one.concat("2");
        System.out.println(one==two);
        System.out.println(two);
    }
}
class e20{
    public void method() {
        String teams = new String("694");
        teams.concat(" 1155");
        teams.concat(" 2255");
        System.out.println(teams);
        String[] array = {"Neo", "Boy"};
        //List<String> array2 = new Arrays.asList(array);
       // array2.set("art");
    }
}
class e19{
    interface Target{
        boolean needToAim(double angle);
    }
    static void prepare(double angle, Target t){
        boolean ready = t.needToAim(angle);
        System.out.println(ready);
    }

    //e19.prepare(45,d->d>5||d<-5);
}
class e18{
    public void method(){
        List<String> museum = new ArrayList<>(1);
        museum.add("Natural Science");
        museum.add("2 Addition");
        museum.add("3 Addition");
        museum.remove(2);
        System.out.println(museum);
    }
}
class e17{
    public void method(){
        System.out.println("1-- "+new StringBuilder().append("clown"));
        System.out.println("2-- "+new StringBuilder("clown"));
        System.out.println("3-- "+new StringBuilder("cl").insert(2,"own"));
        System.out.println("4-- "+new StringBuilder("cl").insert(2,"own"));
       // StringBuilder sb = new StringBuilder("Clown").insert(sb.length(),"robots");

    }
}
class e16{
    public void method(){
        try{}

        catch (ClassCastException c1){}
        catch (IllegalArgumentException e){}
    }

}
class e15{
    class DragonException extends Exception{}
    class Lair{
        public void openDrawBridge() throws Exception{
            try{
                throw new Exception("Exception");
            }
            catch(RuntimeException e){
                throw new DragonException();
            }
            finally{
                throw new RuntimeException();
                }
            }
        }
    }
class e14{

    class A extends B{}
    class B extends Exception{}
    public interface C{
        public void method() throws A;
    }
    class D implements C{
        public void method() throws A{}
    }
}
class e13{
    class parent{
        public void method() throws RuntimeException{}
    }
    class child extends parent{
        //public void method() throws Exception{}
    }
}
class e12{
    public void Exception(){
        final Object exception = new Exception();
        final Exception data = (RuntimeException)exception;
        System.out.println(data);
       // try{}
        //catch (Throwable t){}
       // catch (RuntimeException e1)
       // catch (ClassCastException e){}
        //catch (RuntimeException r){}
    }
}
class e11 {
    public void checkTryBlocks() throws RuntimeException{
        try {
            System.out.println("1---");
            throw new FileNotFoundException("qq");
        } catch (Exception e) {
            try {
                System.out.println("2---");
                throw new Exception();
            } catch (Exception eee) {
                System.out.println("4---");
            }
        } finally {
            try {
                System.out.println("5---");
                throw new Exception();
            } catch (Exception e) {
            }
        }
    }

}
class e10{
    class GasElement extends Exception{}
    class Element{
        public int getElement() throws GasElement{ return -1;}
    }
    class Oxgyen extends Element{
        public int getSymbol(){return -8;}
        public void printData(){
            try{
                System.out.println(getSymbol());
            }
            catch (Exception e){}
            finally {
              //  throw new Exception();
            }
        }
    }
}
class e9{
    class PrintException extends Exception{}
    class PaperPrintException extends PrintException{}
    public interface Printer{
        abstract int printData() throws PrintException;
    }
    class Implementing implements Printer{
        public int printData() throws PrintException{
            return 1;
        }
    }
}
class e8{
    public void method() {
        try {
            System.out.print("A");
            throw new RuntimeException("Out of Bounds");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.print("B");
         //   throw t;
        } finally {
            System.out.print("c");
        }
    }
}
class e7 {
    public void method() {
        try {
            throw new IOException();
        } catch (IOException e) {
        } catch (Exception e1) {
        }
    }
}
class e6{
    class Baseball{
        public void meth(){
            int score = 1;
            try{
                System.out.println("Line-1"+score++);
            }
            catch(Throwable t){
                System.out.println("Line-2"+score++);
            }
            finally {
                System.out.println("Line-3  "+score++);
            }
        }

    }
}
class e5{
    class Remember{
        public void think() throws Exception{
            try{
                throw new Exception();
            }
            catch(Exception e){}
        }
    }
}
class e4{
    class parent{ public parent()throws EOFException {};}
    class child extends parent{public child()throws IOException{};}
}
class e3{
    abstract class House{
        protected abstract Object getSpace();
    }
    abstract class Room extends House{
        abstract Object getSpace(Object list);
    }
}
class e2{
    interface checkInterfaceMethod{
        static void x(){}
        default void xq(){};
    }
}
class e1 {
    class Q2 extends ComplexMath {
        public final double x = 4;

        public final void dance() {
        }

        public void main(String[] args) {
            ComplexMath math = new Q2();
            System.out.println(math.x);
            Q2 q = new Q2();
            q.dance();
        }
    }

    class Math {
        public final double x = 0;

    }

    class ComplexMath extends Math {
        public final double x = 2;

        protected void dance() throws FileNotFoundException {
        }

    }

}

