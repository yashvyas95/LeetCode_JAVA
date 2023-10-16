package com.LeetCode.Solutions.findDifference;

public class findDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int lastindex = -1;
        for (char c : t.toCharArray())
            if (s.indexOf(c) == -1)
                return c;
        return t.charAt(0);
    }
}
