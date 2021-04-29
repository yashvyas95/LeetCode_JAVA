package com.LeetCode.Solutions.goodPairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.LongStream;

public class goodPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        //rayList<Integer> tempList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                var temp = map.get(nums[i]);
                temp.add(i);
                map.put(nums[i], temp);
            } else {
                var temp = new ArrayList<Integer>();
                temp.add(i);
                map.put(nums[i], temp);
            }
        }
        int result = 0;
        var temp = map.values().toArray();
        for (var value : temp) {
            result += calculateCount(((List) value).size());
        }

        return result;
    }

    public static long calculateCount(int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += size - i - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(a));
    }

}
