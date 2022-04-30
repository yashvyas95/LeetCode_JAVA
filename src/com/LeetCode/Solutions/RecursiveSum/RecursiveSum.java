package com.LeetCode.Solutions.RecursiveSum;

import java.util.*;

public class RecursiveSum {
    public static void main(String[] args) {

        String n = "";
        System.out.println(superDigit(n, 10000));
    }

    public static int superDigit(String n, int k) {

        double Number = Double.parseDouble(n);
        double digit = 0;

        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        if (Number > 9) {

            for (int i = 0; i < n.length(); i++) {
                for (var x : n.toCharArray()) {
                    digit += Character.getNumericValue(x);
                }
                if (k > 1) {
                    digit *= k;
                    return superDigit(String.valueOf((int) digit), 1);
                } else {
                    return superDigit(String.valueOf((int) digit), 1);
                }
            }
        }
        return (int) Number;


    }
}
