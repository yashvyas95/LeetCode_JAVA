package com.LeetCode.Solutions.HackerTest;

public class repeatingString {

    public static long repeatedString(String s, long n) {
        long no_of_times = n / s.length();
        long extra = n - (no_of_times * s.length());
        StringBuilder sb = new StringBuilder();
        if (extra == 0) {
            long counta = s.chars().filter(ch -> ch == 'a').count();
            long countan = counta * no_of_times;
            return countan;
        } else {
            for (int i = 0; i < extra; i++) {
                sb.append(s.charAt(i));
            }
            long counta = s.chars().filter(ch -> ch == 'a').count() * no_of_times;
            counta += sb.toString().chars().filter(ch -> ch == 'a').count();
            return counta;
        }

    }
}
