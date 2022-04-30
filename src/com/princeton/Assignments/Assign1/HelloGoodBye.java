package com.princeton.Assignments.Assign1;

public class HelloGoodBye {
    public static void main(String[] args) {
        if (args.length == 2)
            System.out.println("Hello " + args[0] + " " + args[1]);
        System.out.println("Hello " + args[1] + " " + args[0]);
    }
}
