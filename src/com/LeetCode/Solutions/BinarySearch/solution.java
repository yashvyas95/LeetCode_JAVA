package com.LeetCode.Solutions.BinarySearch;
import java.util.Arrays;

public class solution {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid -1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }



    public static void main(String[] args){
        int[] nums = {-1,0,3,5,2,9,12};
        int target = 2;

        System.out.println(search(nums,target));

    }
}
