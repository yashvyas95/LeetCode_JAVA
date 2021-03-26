package com.LeetCode.Solutions.KweakestRow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KweakestRow {

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] countArray = new int[mat.length];
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            int score = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    sum++;
                }
            }

            //A way to find the row number back.
            score = sum * m + i;
            countArray[i] = score;
        }

        Arrays.sort(countArray);
        for (int i = 0; i < k; i++) {
            countArray[i] = countArray[i] % m;
        }
        return Arrays.copyOfRange(countArray, 0, k);
    }

    public static void main(String[] args) {
        int[][] s = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        var result = kWeakestRows(s, 3);
        for (int a : result) {
            System.out.println(a);
        }
    }
}
