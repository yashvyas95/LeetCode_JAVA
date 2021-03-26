package com.LeetCode.Solutions.maxWater;

import java.util.Arrays;
import java.util.stream.Collectors;

public class maxWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxoArea = 0, area = 0;
        while (i < j) {
            int val = 0;
            if (height[i] < height[j]) {
                area = height[i] * (j - i);
                i++;
            } else {
                area = height[j] * (j - i);
                j--;
            }
            if (maxoArea < area)
                maxoArea = area;
        }
        return maxoArea;
    }
}
