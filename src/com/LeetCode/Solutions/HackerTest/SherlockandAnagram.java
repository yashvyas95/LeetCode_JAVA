package com.LeetCode.Solutions.HackerTest;

import java.util.HashMap;

public class SherlockandAnagram {
    public static int sherlockAndAnagrams(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int value = 1;
        return 0;
    }
}
