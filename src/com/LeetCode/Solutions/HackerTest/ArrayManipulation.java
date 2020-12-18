package com.LeetCode.Solutions.HackerTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayManipulation {


    static long arrayManipulation(int n, int[][] queries) {
        long[] result = new long[n];
        for(int i = 0  ; i < queries.length ; i++){
            for(int a = queries[i][0]-1 ; a < queries[i][1] ; a++){
                result[a] += queries[i][2];
            }
        }
        long max = findmax(result);
        return max;
    }
    static long findmax(long[] q){
        long max = 0;
        boolean flag = false;
        for(long i : q){
            max = (max<i) ? max=i:max;
        }
        return max;
    }
    public static void main(String[] args) throws IOException {

            int[][] q = new int[4][];
            q[0] = new int[]{2,6,8};
        q[1] = new int[]{3,5,7};
        q[2] = new int[]{1,8,1};
        q[3] = new int[]{5,9,15};
        long start = System.currentTimeMillis();
        System.out.println(arrayManipulation(10,q));
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);



    }
    }

