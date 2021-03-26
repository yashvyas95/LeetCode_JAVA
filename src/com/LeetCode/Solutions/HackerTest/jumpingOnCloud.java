package com.LeetCode.Solutions.HackerTest;

import java.util.Arrays;

public class jumpingOnCloud {
    public static int jumpingOnClouds(int[] c) {
        long count = Arrays.stream(c).filter(c1 -> c1 == 1).count();
        System.out.println((c.length - count) / 2 + 1);
        return (int) ((c.length - count) / 2) + 1;

    }

}
