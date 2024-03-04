package com.LeetCode75;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxVowels {

    public int maxVowels(String s, int k) {
        List<Character> vowel = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        boolean continued = false;
        int result_count = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if (i + k < s.length())
                sb.append(s.substring(i, i + k));
            else
                sb.append(s.substring(i));
            int count = 0;
            for (char c : sb.toString().toCharArray()) {
                if (vowel.contains(c))
                    count++;
            }
            result_count = Math.max(count, result_count);

        }
        return result_count;
    }
}
