package com.LeetCode.Solutions.HackerTest;

import java.util.Arrays;

public class stringValidity {
    public static boolean checkValidity(String input) {


        String pattern = "^<\\w+>\\w*<\\/\\w+>";
        System.out.println(input.matches(pattern));
        return input.matches(pattern);
    }
}
