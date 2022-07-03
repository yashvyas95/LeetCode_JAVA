package com.LeetCode.Solutions.countBinarySubStrings;

/*
Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's,
and all the 0's and all the 1's in these substrings are grouped consecutively.
Substrings that occur multiple times are counted the number of times they occur.

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

* */
public class solution {
    public static int countBinarySubstrings(String s) {
        int preCount = 0;
        int result = 0;
        char[] chars = s.toCharArray();
        int curCount = 1;
        for (int i = 1; i < chars.length; i++){
            if (chars[i] == chars[i - 1]){
                curCount++;
                if (curCount <= preCount){
                    result++;
                }
            } else{
                preCount = curCount;
                curCount = 1;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args){
         String s = "00110111";
         System.out.println(countBinarySubstrings(s));
    }
}
