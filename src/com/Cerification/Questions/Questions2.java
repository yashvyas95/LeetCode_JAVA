package com.Cerification.Questions;

import groovy.json.internal.IO;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Questions2 {

    public static void main(String[] args) throws Exception{}

}







class five{
    class Remember{
        public void think() throws Exception{
            try{
                throw new Exception();
            }
            catch(Exception e){}
        }
    }
}
class four{
    class parent{ public parent()throws EOFException {};}
    class child extends parent{public child()throws IOException{};}
}
class three{
    abstract class House{
        protected abstract Object getSpace();
    }
    abstract class Room extends House{
        abstract Object getSpace(Object list);
    }
}
class two{
    interface checkInterfaceMethod{
        static void x(){}
        default void xq(){};
    }
}
class One{
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
