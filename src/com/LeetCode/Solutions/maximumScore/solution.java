package com.LeetCode.Solutions.maximumScore;

import java.util.Arrays;
import java.util.OptionalInt;

public class solution {
    /*

                  score =  min(nums[i],nums[i+1],...,nums[j]) * (j-i+1)
                      |-> good when i<=k<=j
                      |-> k input will be
                              |-> k {0,internal,rightboundary}
                                      -> if boundary
                                                  ->  1. proceed in one direction
                                      -> if internal
                                                  ->  1. proceed in both direction
                                                          -> in each direction
                                                              -> check whether further increase or decrease in position can be done
                                                      -> if on left and min is not changing then continue
              */
    public static int maximumScore(int[] nums, int k) {
        int[] score = new int[nums.length];
        int maxScore = 0;
        if (nums.length == 1) return nums[0];
        if (k == 0) {
            // proceed right -> increment j index
            int min = score[0] = nums[0];
            for (int j = 1; j < nums.length; j++) {
                min = Math.min(nums[j], min);
                score[j] = min * (j + 1);
            }
        }
        if (k == nums.length) {
            // proceed left
            int min = score[nums.length - 1] = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                min = Math.min(nums[i], min);
                score[i] = min * (nums.length - i + 1);
            }
        } else {
            // proceed in both
            for (int r = 0; r < nums.length; r++) {
                int i = k - r - 1;
                int j = k + r + 1;
                if (i < 0) i = 0;
                if (j == nums.length) j = nums.length - 1;
                int[] sub = Arrays.copyOfRange(nums, i, j + 1);
                int min = Arrays.stream(sub).min().getAsInt();
                score[r] = min * (j - i + 1);
            }
        }
        return Arrays.stream(score).max().getAsInt();
    }

    public static void main(String[] args) {
        /** [143745, k = 3 | 15
         /**   [5,5,4,5,4,1,1,1], k = 0 20 */

        int[] arr = new int[]{1, 4, 3, 7, 4, 5};
        int[] arr2 = new int[]{5, 5, 4, 5, 4, 1, 1, 1};
        int[] arr3 = new int[]{6569, 9667, 3148, 7698, 1622, 2194, 793, 9041, 1670, 1872};

        int k = 3, k2 = 5;
        System.out.println(maximumScore(arr3, k2));


    }

}
