package com.LeetCode.Solutions.MinAbsDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {

    public static int minimumAbsoluteDifference2(List<Integer> arr) {
        // Write your code here
        Integer[] arr_to_array = new Integer[arr.size()];
        arr.toArray(arr_to_array);
        int minimumDifference = Integer.MAX_VALUE;
        Arrays.sort(arr_to_array);
        for (int i = 0; i < arr_to_array.length - 1; i++) {
            int difference = arr_to_array[i + 1] - arr_to_array[i];

            if (difference < minimumDifference) {
                minimumDifference = difference;

                if (minimumDifference == 0) {
                    return 0;
                }
            }
        }

        //var copy = arr_to_array.clone();
        int min = Integer.MAX_VALUE;
/*
        for (int i = 0 ; i < arr.size() ; i++) {
            for (int j = 0 ; j < arr.size() ; j++) {
                if (i != j) {
                    int num1 = arr_to_array[i];
                    int num2 = copy[j];
                    int diff = (num1>num2) ? num1-num2 : num2-num1;
                    diff = (diff<0) ? 0-diff : diff;
                    min = (min > diff) ? diff : min;
                }
            }
        }

 */
        return min;
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Integer[] arr_to_array = new Integer[arr.size()];
        arr.toArray(arr_to_array);
        var copy = arr_to_array.clone();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    int num1 = arr_to_array[i];
                    int num2 = copy[j];
                    int diff = (num1 > num2) ? num1 - num2 : num2 - num1;
                    diff = (diff < 0) ? 0 - diff : diff;
                    min = (min > diff) ? diff : min;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        var input = new ArrayList<Integer>();
        input.add(1);
        input.add(-3);
        input.add(71);
        input.add(68);
        input.add(17);
        System.out.println(minimumAbsoluteDifference(input));
    }
}
