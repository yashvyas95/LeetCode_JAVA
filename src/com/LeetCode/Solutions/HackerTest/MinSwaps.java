package com.LeetCode.Solutions.HackerTest;

import java.util.Arrays;

public class MinSwaps {
    static int minimumSwaps(int[] numElements,int[] arr) {
        boolean flag = true;
        int[] diffIndex = new int[numElements[0]];
        int max = findmax(arr);
        int index = find(arr,max);
        int counter = 0;
        while(flag){
            index = find(arr,max);
            if(!(max-index-1==0)){
                arr[index] = arr[max-1];
                arr[max-1] = max;
                counter++;
            }
            if(max>0) {
                max--;
            }
            else{
                flag = false;
            }
        }

        return counter;
    }
    static int findmax(int[] q){
        int max = 0;
        for(int i : q){
            max = (i>max)?max=i:max;
        }
        return max;
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
    public static void main(String[] args){
        int[][] a = new int[2][];
        a[0] = new int[]{7};
        a[1] = new int[]{1,3,5,2,4,6,7};
        int swaps = minimumSwaps(a[0],a[1]);

    }


}
