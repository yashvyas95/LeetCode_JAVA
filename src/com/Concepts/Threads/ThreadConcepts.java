package com.Concepts.Threads;

public class ThreadConcepts {
    class MyThread extends Thread{
        MyThread(){
            System.out.println("MyThread");
        }
        public void run(){
            System.out.println("Bar");
        }
        public void run(String s){
            System.out.println("Baz");
        }
    }

    public static void main(String[] args)throws InterruptedException {
   //     Thread t = new MyThread();
     //   t.start();
        System.out.println("A");
     //   t.wait(1000);
        System.out.println("Y");
    }
}

