package com.LeetCode.Solutions.HackerTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListResourceBundle;
import java.util.*;

public class minMaxriddle {
    public static long[] riddle(long[] arr) {
        // complete this function
        ArrayDeque<Long> arrr = new ArrayDeque<>();
        HashMap<String,long[]> map = new HashMap<>();
        HashSet<Long> set = new HashSet<>();
        HashMap<Long,Long> map2 = new HashMap<>();
        int i ;
        for(long l : arr){
            arrr.add(l);
        }
        return new long[0];
    }
    static long window(long[] arr,int window){
        HashMap<String,Long> map = new HashMap<>();
        switch(window){
            case 1:
                long[] temp = new long[arr.length];
                for(int i = 0 ; i < arr.length ; i++){

                    temp[i] = arr[i];
                }
                map.put("1",Arrays.stream(temp).max().getAsLong());
                temp = null;
                break;
            case 2:
                long[] temp2 = new long[arr.length];
        }
        return 0;
    }
}
