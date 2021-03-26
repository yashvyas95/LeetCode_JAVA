package com.LeetCode.Solutions.intersectionTwoArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class interSectionTwoArrays {
    public static int[] solution(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1_counts = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1_counts.containsKey(nums1[i])) {
                map1_counts.put(nums1[i], map1_counts.get(nums1[i]) + 1);
            } else {
                map1_counts.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map1_counts.containsKey(nums2[i])) {
                if (map1_counts.get(nums2[i]) > 0) {
                    map1_counts.put(nums2[i], map1_counts.get(nums2[i]) - 1);
                    list.add(nums2[i]);
                }

            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
