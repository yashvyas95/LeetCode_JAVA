package com.LeetCode.Solutions.HackerTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class markAndToys {
    static int maximumToys(int[] prices, int k) {
        //HashSet<Integer> a = new HashSet<>();
        var a1 = Arrays.stream(prices).sorted().filter(c1->c1<k).toArray();
        //Object[] temp = a.toArray();
        boolean condition = false;
        int counter = 0;int counter1=0;
        int sum = 0;
        while(!condition){
            if(sum < k && counter<a1.length){
                sum += a1[counter];
                counter++;
                if(sum < k){
                    counter1++;
                }
                else
                    { counter--;
                    break;
                }


            }
            else{
                break;
            }

        }
        return  counter;
    }
    public static void main(String[] args){
        int[] a = new int[]{1,12,5,111,200,1000,10};
        int k = 50;
        System.out.println(maximumToys(a,k));
    }
}
