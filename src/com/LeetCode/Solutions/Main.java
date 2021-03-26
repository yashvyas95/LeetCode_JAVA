package com.LeetCode.Solutions;

import com.LeetCode.Solutions.RomanNumerals.RomanNumerals;
import com.LeetCode.Solutions.LongestCommonPrefx.longestCommonPrefix;

import java.util.*;

public class Main {

    String str = "aba";

    public static void main(String[] args) {
        //         int[][] test = new int[3][];
        //          test[0]=new int[]{1,3};
        //    test[1]=new int[]{2,2};
        //   test[2]=new int[]{3,1};
        //test[1]=new int[]{2,5};
        //   int truckSize = 4;
        //    System.out.println(maximumUnits(test,4));

    }
/*
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        //var map = new HashMap<Integer,Integer>();
        int[] truck = new int[truckSize];
        int[] boxes = new int[boxTypes.length];
        int[] boxes_no = new int[boxTypes.length];
        int k = 0;
        for(int[] i : boxTypes){
            // map.put(i[1],i[0]);
            boxes[k]=i[0];
            boxes_no[k]=i[1];
            k++;
        }
        var sorte = Arrays.stream(boxes_no).sorted().toArray();
        int z = sorte.length-1;
        int total=0;
        int ignore=-1;
        while(truckSize>0 && z>-1){
            int index = give_index(boxes_no,sorte[z],ignore);
            if(index!=-1){
                if(boxes[index]!=0){
                    int mul = truckSize>boxes[index]?boxes[index]:truckSize;
                    total+=(boxes_no[index]*mul);
                    boxes[index]=boxes[index]-(mul);
                    truckSize-=mul;
                }
                else{
                    ignore=index;
                }
            }
            else{
                z--;
            }

        }
        return total;
    }
*/
    /*
    public static int give_index(int[] a , int b, int ignore){
        int index=-1;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]==b && i!=ignore){
                index = i;
                return i;
            }
        }
        return index;
    }

     */
}

