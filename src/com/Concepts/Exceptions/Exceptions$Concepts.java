package com.Concepts.Exceptions;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;

public class Exceptions$Concepts {
    public static class MultiCatch{
        class one{
            //==Case-1
            //Catch 1 - Sub Class
            //Catch 2 - Super Class
            public void method(){
                try{
                    System.out.println("In Try");
                    throw new IllegalArgumentException("SuperClass is RUNTIME EXCEPTION");
                }
                catch (IllegalArgumentException e1){
                    System.out.println("Illegal Argument Exception");
                }
                catch (RuntimeException e){
                    System.out.println("In Catch");
                }
                /*
                catch (RuntimeException e){
                    System.out.println("In Catch");
                }

                catch (IllegalArgumentException e1){
                    System.out.println("IN CATCH SUPER CLASS");

                }

                 */
                finally {
                    System.out.println("In Finally");
                }
                System.out.println("Out of Try BLock");
            }

        }
        class two{
            public void method(){
                try{
                    System.out.println("In Try");
                    throw new IllegalArgumentException("Different type");
                }
                catch (ArrayIndexOutOfBoundsException | NullPointerException | IllegalArgumentException e){
                    System.out.println("Inside Catch");
                }
                finally {
                    System.out.println("Inside Finally");
                    throw new ArrayIndexOutOfBoundsException("From Finally");
                }

            }
        }

    }
    public static class CustomException{
        static class one{
            class isTired extends Exception{}
            class isEngertic extends RuntimeException{}
            interface Roar{
                void roar() throws isTired;
            }
            static class Lion implements Roar{

                public void roar() throws isEngertic{
                    System.out.println("In Roar");
                }
                //public void roar() throws isTired{}

                //public void roar() throws Exception{}
                //public void roar() throws RuntimeException{}
                //public void roar() throws IllegalArgumentException{}

            }
        }
        class two{
            public void whatHappesNext() throws IOException{
            //    throw new IllegalArgumentException();
            //    throw new java.io.IOException();
                  throw new RuntimeException();

            }
            public Error returnException(){
                return new OutOfMemoryError();
            }
        }
    }
    public static class Mouse{
        public String name;
        public void findCheese(){
            System.out.println("1");
            try{
                System.out.println("2");
                name.toString();
                System.out.println("3");
            }
            catch (NullPointerException e){
                System.out.println("4");
                throw e;
            }
            System.out.println("5");
        }
    }

    public static void main(String[] args){
        Exceptions$Concepts c1 = new Exceptions$Concepts();
        Mouse m = new Mouse();
        m.findCheese();




    }
}
