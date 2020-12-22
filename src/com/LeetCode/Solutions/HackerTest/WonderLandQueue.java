package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WonderLandQueue {
    public static void main(String[] args) {
        int[] q = {1, 2, 3, 4, 5};
        int[] q1 = {2, 1, 5, 3, 4};
        int[] q2 = {1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(q2);
        Scanner s = new Scanner(System.in);
        //Character.
    }

    static int stepsCounter(int[] q){
        boolean flag = true;
        int counter = 0;
        int k = 0;
        int max = findmax(q);
        while(flag && (max>0)){
            int index = find(q,max);
            if(!((index+1-max)==0) && index!=-1){
                while(k<2 && !((index+1-max)==0)) {
                    if(q[index + 1] < q[index]){
                        q[index] = q[index+1];
                        q[index + 1] = max;
                        counter++;k++;
                        index = index+1;
                    }

                }
                k=0;
                if((index+1-max)!=0){flag = false;}
            }
            max--;
        }
        return counter++;
    }
    static int find(int[] a, int target)
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int findmax(int[] q){
        int max = 0;
        for(int i : q){
            max = (i>max)?max=i:max;
        }
        return max;
    }
    static void minimumBribes(int[] q) {
        int[] diff_index = new int[q.length];
        boolean flag = true;
        if(q.length >= 1 && q.length <= Math.pow(10,5));
        for (int i = 0 ; i < q.length ; i++){
            if((diff_index[i] = q[i]-i-1)>2){
                System.out.println("Too chaotic");
                flag=false;
                break;

            }
        }
        int counter = stepsCounter(q);
        if(flag) System.out.println(counter);
    }
}



