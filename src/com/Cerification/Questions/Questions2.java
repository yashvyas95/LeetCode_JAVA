package com.Cerification.Questions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Period;
import java.time.Period.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.time.LocalDate;

public class Questions2 {

    public static void main(String[] args) throws Exception {

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
class e1{
    class Q2 extends ComplexMath{
        public final double x =  4;
        public final void dance(){}
        public void main(String[] args){
            ComplexMath math = new Q2();
            System.out.println(math.x);
            Q2 q = new Q2();
            q.dance();
        }
    }
    class Math{
        public final double x =  0;

    }
    class ComplexMath extends Math{
        public final double x =  2;
        protected void dance() throws FileNotFoundException {}

    }

}

