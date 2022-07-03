package com.LeetCode.Solutions.minJumps;

import java.util.Collections;
import java.util.PriorityQueue;

public class solution {
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        int pos = 0;
        int jump=0;
        int reachable = 0;
        for(int i = 0; i < n; i++){
            if(reachable<i)
                return -1;
            reachable = Math.max(reachable, i+arr[i]);
            if(pos == i && i!=n-1){
                pos = reachable;
                jump++;
            }
        }
        return jump;
    }
    public static void main(String[] args){
            int[] a = new int[]{1, 4, 3, 2, 6, 7};
            System.out.println(minJumps(a));
    }
}
