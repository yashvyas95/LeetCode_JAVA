package com.LeetCode.Solutions.contest;
import java.util.*;

public class solution {
    public static long countSubarrays(int[] nums, long k) {
        long count = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = 1 ; j <= nums.length; j++)
            {
                if(i+j >nums.length) break;
                int[] subarray = Arrays.copyOfRange(nums, i, i+j);
                long score = (Arrays.stream(subarray).sum()) * ((long)subarray.length);
                if(score<k){
                    count= count+1;
                }
                else{
                    break;
                }

            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,9,1,5};
        int target = 96;
        System.out.println(countSubarrays(nums,target));
    }
}
