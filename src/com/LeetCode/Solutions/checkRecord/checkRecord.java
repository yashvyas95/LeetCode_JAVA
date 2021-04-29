package com.LeetCode.Solutions.checkRecord;

import java.util.*;

public class checkRecord {

    public static boolean checkRecord(String s) {
        var array = s.toCharArray();
//        long count = Arrays.asList(array).stream().filter(c->c.equals('A')).count();
        long count = s.chars().filter(c -> c == 'A').count();
        if (count >= 2) {
            return false;
        } else {
            String s1 = "LLL";
            if (s.contains(s1)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static int networkDelayTime(int[][] times, int n, int k) {
        /* make a 2d graph or using list*/
        int arr[][] = new int[n][n];
        for (int ar[] : arr) {
            Arrays.fill(ar, -1);
        }
        for (int i = 0; i < times.length; i++) {
            arr[times[i][0] - 1][times[i][1] - 1] = times[i][2];
        }
        /* perform dijkstra algorithm*/
        /* shortest distance of all nodes from k is calculated and then the largest
        distance of this group is the solution*/
        /* if Integer.MAX_VALUE is present as the highest in the array
        then that node cannot be reached so -1 is the solution*/
        int result[] = new int[n];
        Arrays.fill(result, Integer.MAX_VALUE);
        boolean visited[] = new boolean[n];
        result[k - 1] = 0;
        for (int i = 0; i < n; i++) {
            int min = getMin(visited, result);
            if (min == -1) {
                break;
            }
            visited[min] = true;
            for (int j = 0; j < n; j++) {
                if (arr[min][j] != -1 && !visited[j] && result[min] + arr[min][j] < result[j]) {
                    result[j] = result[min] + arr[min][j];
                }
            }
        }
        Arrays.sort(result);
        if (result[n - 1] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return result[n - 1];
        }

    }

    public static void main(String[] args) {
        checkRecord("AAAA");
        int[][] time = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        networkDelayTime(time, n, k);
    }


    private static int getMin(boolean visited[], int result[]) {
        int length = result.length;
        int index = -1;
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (!visited[i] && value > result[i]) {
                value = result[i];
                index = i;
            }
        }
        return index;
    }
}