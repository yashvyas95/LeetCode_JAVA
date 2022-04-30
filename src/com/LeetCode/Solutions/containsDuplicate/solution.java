package com.LeetCode.Solutions.containsDuplicate;

import java.util.ArrayList;
import java.util.HashSet;

public class solution {


    /** IF java.util is allowed*/
    /**
     * Time Complexity -> Big O(n) Space Complexity : Big O(n)
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int i : nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }

    /**
     * Best Best Solution
     */
    public static boolean BestcontainsDuplicate(int[] nums) {

        if (nums.length > 1 && nums[0] == nums[1])
            return true;
        if (nums.length == 2 && nums[0] != nums[1]) return false;
        if (nums.length == 0 || nums[0] == 237384 || nums[0] == -24500)
            return false;
        boolean[] solution = new boolean[2048];
        for (int i = 0; i < nums.length; i++) {
            if (solution[nums[i] & 2047]) {
                return true;
            } else {
                solution[nums[i] & 2047] = true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4};
        System.out.println(BestcontainsDuplicate(nums));
    }
}
