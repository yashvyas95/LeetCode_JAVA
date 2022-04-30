package com.LeetCode.Solutions.MinTime;

import java.util.Arrays;

public class MinTime {

    static long minTime(long[] machines, long goal) {
        long count = 0;
        int present_day = 1;
        while (count < goal) {
            for (int i = 0; i < machines.length; i++) {
                if (present_day % machines[i] == 0) {
                    count++;
                    if (count == goal) {
                        return present_day;
                    }
                }
            }
            present_day++;
        }
        return present_day;
    }

    public static void main(String[] args) {
        var x = new long[]{2, 3};
        var z = 5;
        var z1 = minTime(x, z);
        System.out.println(z1);
    }
}