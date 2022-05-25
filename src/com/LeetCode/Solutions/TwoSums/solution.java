package com.LeetCode.Solutions.TwoSums;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static int[] twoSum(int[] nums, int target) {
        /** For Time Complexity less than O(n^2)*/
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums,target);
    }
}
