package com.LeetCode.Solutions.HourGlass;

import java.util.ArrayList;

public class HourGlass {

    // 6*6
    // *** *.**
    // *|| ||*
    // *** ***
    // *** ***
    // *|| ||*
    // *** ***

    public void maxSumHourGlass(ArrayList<ArrayList<Integer>> list) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int pointx = j;
                int pointy = i;
                var row_array = list.get(i);
                for (int i1 = 0; i < i + 2; i++) {
                    int col1 = row_array.get(i1);
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
