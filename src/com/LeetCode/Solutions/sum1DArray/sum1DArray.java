package com.LeetCode.Solutions.sum1DArray;

import java.util.Arrays;

public class sum1DArray {
    public static int[] solution(int[] nums) {
        int[] nums_clone = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            nums_clone[i] = Arrays.stream(Arrays.copyOfRange(nums, 0, i + 1)).sum();
        }
        return nums_clone;
    }

    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }
        return arr;
    }
/*
    public static void main(String[] args){
        var a = new int[]{1,1,1,1,1};
        System.out.println(solution(a));
    }

 */
}
