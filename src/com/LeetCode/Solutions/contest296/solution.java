package com.LeetCode.Solutions.contest296;

import java.util.*;

public class solution {

    public static int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
            map.put(nums[i],i);

        for(int[] op : operations)
        {
            int index = map.get(op[0]);
            if(index!=-1)
            {
                map.put(op[1],index);
                nums[index] = op[1];
            }


        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = new int[]{1,2};
        int[][] operations = new int[3][2];
        operations[0] = new int[]{1,3};
        operations[1] = new int[]{2,1};
        operations[2] = new int[]{3,2};
        arrayChange(nums,operations);

    }
}
