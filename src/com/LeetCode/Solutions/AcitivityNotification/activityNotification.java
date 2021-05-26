package com.LeetCode.Solutions.AcitivityNotification;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class activityNotification {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        //      int n = sc.nextInt();
//        int d = sc.nextInt();
        int[] expenditures = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int d = 5;
        //    for (int i = 0; i < expenditures.length; i++) {
        //       expenditures[i] = sc.nextInt();
        //  }

        System.out.println(solve(expenditures, d));

        //sc.close();
    }

    static int solve(int[] expenditures, int d) {
        int[] counts = new int[201];
        for (int i = 0; i < d; i++) {
            counts[expenditures[i]]++;
        }

        int result = 0;
        for (int i = d; i < expenditures.length; i++) {
            int lower = 0;
            int leftNum = 0;
            while ((leftNum + counts[lower]) * 2 <= d) {
                leftNum += counts[lower];
                lower++;
            }

            int upper = counts.length - 1;
            int rightNum = 0;
            while ((rightNum + counts[upper]) * 2 <= d) {
                rightNum += counts[upper];
                upper--;
            }

            if (expenditures[i] >= lower + upper) {
                result++;
            }

            counts[expenditures[i - d]]--;
            counts[expenditures[i]]++;
        }
        return result;
    }
}