package com.LeetCode.Solutions.isValidSudoku;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class isValidSudoku {

    public static boolean isValidSudoku(char[][] board) {

        eachRowCheckin(board);
        eachBlockChecking(board);
        return false;
    }

    public static boolean eachRowCheckin(char[][] board) {
        boolean result = true;
        for (char[] row : board) {
            var char_dict = Arrays.asList(row).stream().distinct().collect(Collectors.toList());
            for (char c : char_dict.get(0)) {
                if (c != '.') {
                    var count = char_dict.stream().filter(c1 -> c1.equals(c)).count();
                    if (count > 1) {
                        result = false;
                    }
                    break;
                }
            }
        }
        return result;
    }


    public static boolean eachBlockChecking(char[][] board) {
        boolean result = true;
        int i = 0;
        while (i < 9) {

        }
        return result;
    }


}
