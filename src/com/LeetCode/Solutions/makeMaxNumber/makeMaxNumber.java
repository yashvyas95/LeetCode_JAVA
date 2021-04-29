package com.LeetCode.Solutions.makeMaxNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class makeMaxNumber {

    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] result = new int[nums1.length + nums2.length];
        int[] sendCopy = new int[k];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        //var x = Arrays.asList(result).stream().p
        //var y = (int[])x[0];
        // Arrays.sort(y);
        ArrayList<Integer> re = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (!re.contains(sendCopy[i])) {
                re.add(sendCopy[i]);
                //          sendCopy[i] = (Integer) y[y.length - i - 1];
            }


        }
        return sendCopy;
    }


    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};
        int[] result = maxNumber(nums1, nums2, 3);
        StringBuilder sb = new StringBuilder();

    }
}
