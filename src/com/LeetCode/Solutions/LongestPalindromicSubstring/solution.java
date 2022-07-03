package com.LeetCode.Solutions.LongestPalindromicSubstring;

public class solution {

    static int len = 0, maxLength = 0, init = 0;
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        len = s.length();
        if (len <= 1) return s;
        for (int i = 0; i < len; i++) {
            i = manacher(chars, i);
        }
        return s.substring(init, init + maxLength);
    }
    public static int manacher(char[] chars, int center) {
        int i = center - 1, j = center;
        while (j < len - 1 && chars[j] == chars[j + 1]) j++;
        int nextCenter = j++;
        while (i >= 0 && j < len && chars[i] == chars[j]) {
            i--;
            j++;
        }
        if (j - i - 1 > maxLength) {
            maxLength = j - i - 1;
            init = i + 1;
        }
        return nextCenter;
    }

    public static void main(String[] args){
         String s = "aba";
         String s2 = "bababd";

        //System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome(s2));
    }
}
