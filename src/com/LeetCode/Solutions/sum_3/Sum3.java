package com.LeetCode.Solutions.sum_3;

import java.util.List;

public class Sum3 {
    public static List<List<Integer>> sum3(int[] nums){

        if(nums.length < 3){return null;}
        else{
            int total_order = factorial(nums.length);
            int first = 0, second = 0, third = 0;
            for(int order = 0 ; order < total_order ; order++){

            }
        }
        return null;
    }
    public static int factorial(int num){
        int factorial = 1;
        int factorial2 = 1;
        for(int i = num ; i>num-3 ; i--){
            factorial = factorial*i;
            factorial2 = factorial2*(num-i);
        }
        return factorial/factorial2;
    }
}
