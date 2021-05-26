package com.LeetCode.Solutions.CountInversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class countInversion {
    public static long solution(List<Integer> arr) {
        boolean condition = true;
        int index = 0;
        long counts = 0;
        if (arr.size() == 0 || arr.size() == 1) {
            return 0;
        } else {
            int inv_count = 0;
            for (int i = 0; i < arr.size() - 1; i++)
                for (int j = i + 1; j < arr.size(); j++)
                    if (arr.get(i) > arr.get(j))
                        counts++;
        }
        return counts;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println(solution(list));
    }
}
