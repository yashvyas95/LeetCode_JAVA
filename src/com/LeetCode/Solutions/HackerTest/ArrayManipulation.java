package com.LeetCode.Solutions.HackerTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
        ArrayList<int[]> afterOperation = new ArrayList<>();
        int[] inital = new int[n];
        afterOperation.add(0,inital);
        boolean flag = true;
        if((n < 3 || n > Math.pow(10,7)) || (queries.length < 1 || queries.length > 2*Math.pow(10,5))){ flag = false;}
        if(flag){
            for (int i = 0 ; i < queries.length ; i++) {
                if(flag){
                    int[] temp = queries[i];
                    int index1 = temp[0] - 1;
                    int index2 = temp[1] - 1;
                    if (index1 > index2) {
                        flag = false;
                    } else {
                        for (int i1 = index1; i1 <= index2; i1++) {
                            if (temp[temp.length - 1] >= 0 && temp[temp.length - 1] <= Math.pow(10, 9)) {
                                inital[i1] += temp[temp.length - 1];
                            }
                        }
                        afterOperation.add(inital);
                    }
                }
                else{ return 0;}

            }
            return Arrays.stream(inital).max().getAsInt();
        }
        return 0;
    }
    static long arrayManipulaion2(int n, int[][] queries){
        System.out.println(Math.pow(10,9));
        int[] inital = new int[n];
        boolean flag = true;
        if((n > 3) && (n < Math.pow(10,7))){
            if(queries.length >= 1 && queries.length < 2*Math.pow(10,5)){
                for (int i = 0 ; i < queries.length ; i++) {
                    int[] temp = queries[i];
                    int index1 = temp[0] - 1;
                    int index2 = temp[1];
                    if (index1 > index2) {
                        flag = false;
                    } else {
                        for (int i1 = index1; i1 <= index2; i1++) {
                            if (temp[temp.length - 1] >= 0 && temp[temp.length - 1] <= Math.pow(10, 9)) {
                                if(temp[temp.length-1] >= 0 || temp[temp.length-1] <= Math.pow(10,8)) {
                                    inital[i1] += temp[temp.length - 1];
                                }
                            }
                        }
                    }

                }
            }
        }
        System.out.println(Arrays.stream(inital).max().getAsInt());
        return Arrays.stream(inital).max().getAsInt();
    }


    public static void main(String[] args) throws IOException {
        File input = new File("input04.txt");
        System.out.println(input.canRead());
        if(!input.canRead()){
            new File("input04.txt");
            
        }
        if(input.canRead()){
        int rows = 300001;
        int[][] myArray = new int[rows][];
        int counter = 0;
        int numOfElem = 0;


        }
        }
    }

