package com.LeetCode.Solutions.UserActiveMinutes;

import java.util.ArrayList;
import java.util.HashMap;

public class UserActiveMinutes {

    public static int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] result = new int[k];
        for (int[] a : logs) {
            if (map.containsKey(a[0])) {
                var list = map.get(a[0]);
                if (list.indexOf(a[1]) == -1) {
                    list.add(a[1]);
                    map.put(a[0], list);
                }
            } else {
                ArrayList<Integer> timeLog = new ArrayList<>();
                timeLog.add(a[1]);
                map.put(a[0], timeLog);
            }
        }
        var set = map.keySet();
        for (Integer i : set) {
            var tempUAM = map.get(i).size();
            ++result[tempUAM - 1];
        }
        return result;
    }

}
