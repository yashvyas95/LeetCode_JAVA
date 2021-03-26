package com.LeetCode.Solutions.ExclusiveTimeOfFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExclusiveTimeOfFunctions {

    public static int[] solution(int n, List<String> logs) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> Length = new ArrayList<>();
        for (int i = 0; i < logs.size(); i++) {
            var row = logs.get(i).split(":");
            if (row[1].equals("start")) {
                list.add(Integer.parseInt(row[2]));
            } else if (row[1].equals("end") && logs.size() != 0) {
                int length = Integer.parseInt(row[2]) - list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int n = 2;
        String[] log2s = new String[]{"0:start:0", "1:start:2", "1:end:5", "0:end:6"};
        var x = Arrays.asList(log2s);
        solution(n, x);
    }
}
