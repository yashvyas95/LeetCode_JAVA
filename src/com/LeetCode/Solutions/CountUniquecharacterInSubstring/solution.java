package com.LeetCode.Solutions.CountUniquecharacterInSubstring;
import java.util.*;

public class solution {
    public static int uniqueLetterString(String s) {
        //Reference Solution
        // dp to store the countUniqueChars(s) of Strings ending at last char.
        int dp = 1;
        // HashMap from char to int[last position in s, second last position in s]
        Map<Character, int[]> hashMap = new HashMap<>();
        int result = 1;
        hashMap.put(s.charAt(0), new int[]{0, -1});
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, new int[]{-1, -1});
            }
            int[] positionArray = hashMap.get(c);
            int lastPosition = positionArray[0];
            int secondLastPosition = positionArray[1];
            dp = dp + (i - lastPosition) - (lastPosition - secondLastPosition);
            result += dp;
            positionArray[1] = positionArray[0];
            positionArray[0] = i;
        }
        return result;


    }

    public static void main(String[] args){
        String s = "LEETCODE";
        uniqueLetterString(s);
    }
}
