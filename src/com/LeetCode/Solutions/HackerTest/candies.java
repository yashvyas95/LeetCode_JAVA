package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class candies {
    public static long candiesMethod2(int n , int[] arr) {
        for(int i = 0 ; i < n ; i++){
            
        }
        return 0;
    }
    public static long candiesMethod(int n, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long count=0;
        int temp = 0;
        int[] counts = new int[arr.length];
        int offered = 0;
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(arr[i])){map.put(arr[i],map.get(arr[i])+1);}
            else{map.put(arr[i],1);}
            if(i==0){counts[i]=1;}
            if( i>0 && arr.length>1 && arr[i]>arr[i-1] && arr[i]!=Arrays.stream(arr).min().getAsInt()){counts[i]=counts[i-1]+1;}
            if( i>1 && arr[i-1]>=arr[i] && arr[i]!=Arrays.stream(arr).min().getAsInt()){
                counts[i]=counts[i-1]-1;
                if(map.containsKey(arr[i]) && arr[i]!=Arrays.stream(arr).min().getAsInt()){
                    if(counts[getIndex(arr,arr[i])]!=1){
                        if(i<arr.length-1){
                            if(arr[i]>arr[i+1]){
                                counts[i]=0;
                            }
                        }
                        counts[i]=counts[getIndex(arr,arr[i])]-1;
                    }
                }
            }
            if(arr[i]==Arrays.stream(arr).min().getAsInt()){counts[i]=1;}
        }
        int no_Rating = map.keySet().size();

        return Arrays.stream(counts).sum();
    }
    public static int getIndex(int[] arr, int element){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
