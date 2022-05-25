package com.ProjectEuler;
/**
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */
public class p1 {
    public static void main(String[] args){
        /* Brute Force*/
        long sum = 0;
        for(int i = 3 ; i < 1000 ; i++){
            if(i%3==0 || i%5==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
