package com.LeetCode.Solutions.pascaslTriangle2;

import java.util.*;

public class pascalTriangle2 {
    public static void main(String[] args) {
        System.out.println(getRow(1));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long ans = 1;

        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) ans);
            ans = ans * (rowIndex - i);
            ans = ans / (i + 1);
        }

        return row;
    }
}
