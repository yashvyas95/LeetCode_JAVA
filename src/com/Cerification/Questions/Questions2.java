package com.Cerification.Questions;

import groovy.json.internal.IO;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Questions2 {

    public static void main(String[] args)
    {
        e12 E_12 = new e12();
        E_12.Exception();
    }
}


class e13{

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

