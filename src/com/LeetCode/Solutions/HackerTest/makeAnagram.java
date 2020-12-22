package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class makeAnagram {
        public static int makeAnagram(String a, String b) {
            HashMap<Character, Integer> map = new HashMap<>();
            for( char ch: a.toCharArray() ) {
                int ct = map.containsKey(ch) ? map.get(ch) : 0;
                map.put(ch, (ct + 1));
            }

            for( char ch: b.toCharArray() ) {
                int ct = map.containsKey(ch) ? map.get(ch) : 0;
                map.put(ch, (ct - 1));
            }

            ArrayList<Integer> values = new ArrayList<>( map.values() );
            int total = 0;
            for( Integer v: values ) {
                total += Math.abs(v);
            }
            return total;
        }

}
