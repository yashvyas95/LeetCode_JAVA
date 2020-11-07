package com.Cerification.Questions;

import groovy.json.internal.IO;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Questions2 {

    public static void main(String[] args)
    {

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

