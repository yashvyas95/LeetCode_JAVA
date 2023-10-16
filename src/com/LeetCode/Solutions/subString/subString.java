package com.LeetCode.Solutions.subString;

public class subString {

    public static boolean isSubsequence(String s, String t) {
        boolean result = true;
        int index = -1;
        int lastindex = -1;
        int length = 0;
        for (char c : s.toCharArray()) {
            lastindex = index;
            index = t.indexOf(c, lastindex + 1);
            if (index == -1 || index < lastindex) {
                result = false;
                break;
            } else {
                length++;
            }
        }
        if (length != s.length())
            return false;
        return result;
    }

    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";

        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }
}
