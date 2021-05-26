package com.LeetCode.Solutions.BinaryLongestZero;

import java.util.*;

public class Solution {
    public static int solution(int N) {
        // write your code in Java SE 8
        ArrayList<Integer> container = new ArrayList<>();
        String binary_Rep = Integer.toBinaryString(N);
        boolean checker = true;
        int from_index = 0;
        while (checker) {
            int index = binary_Rep.indexOf('1', from_index);
            if (index == -1) {
                checker = false;

            } else {
                container.add(index);
                from_index = index + 1;
            }
        }
        if (container.size() < 2) {
            return 0;
        } else {
            int max_diff = -1;
            for (int i = 1; i < container.size() - 1; i++) {
                int diff = container.get(i) - container.get(i - 1) - 1;
                if (max_diff < diff) {
                    max_diff = diff;
                }
            }
            return max_diff;
        }
    }

    public static void main(String[] args) {
        int i = 1041;
        solution(i);

    }
}
