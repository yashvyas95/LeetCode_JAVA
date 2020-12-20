package com.LeetCode.Solutions.HackerTest;

import java.util.HashMap;
import java.util.HashSet;

public class pairs {
    public static int pairsmethod(int k, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : arr){
            set.add(i);
        }
        for(int i : arr){
            if((set.contains(k-i) || set.contains(i-k)) && (k-i !=i)){
                count++;
            }
        }
        return count;
    }
}
