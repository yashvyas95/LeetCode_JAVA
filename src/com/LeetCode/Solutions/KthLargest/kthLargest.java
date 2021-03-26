package com.LeetCode.Solutions.KthLargest;

import java.util.Arrays;

public class kthLargest {
    public static int solution(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k - 1];
    }
}
