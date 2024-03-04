package com.LeetCode75;

import java.util.List;
import java.util.ArrayList;

public class findDifferenceArray {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        for (int i : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (i != nums2[j] && j == nums2.length && !res1.contains(nums2[j])) {
                    res1.add(nums2[j]);
                } else if (i == nums2[j]) break;
            }
        }
        for (int i : nums2) {
            for (int j = 0; j < nums1.length; j++) {
                if (i != nums1[j] && j == nums1.length && !res2.contains(nums2[j])) {
                    res1.add(nums2[j]);
                } else if (i == nums2[j]) break;
            }
        }
        result.add(res1);
        result.add(res2);
        return result;
    }
}
