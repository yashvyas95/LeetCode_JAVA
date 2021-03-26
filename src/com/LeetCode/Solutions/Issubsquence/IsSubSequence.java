package com.LeetCode.Solutions.Issubsquence;


import java.util.ArrayList;
import java.util.List;

public class IsSubSequence {
    public static boolean solution(String s, String t) {
        int previous = -1;
        List<Integer> list = new ArrayList<>();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (t.indexOf(s.charAt(i)) == -1) {
                    return false;
                }
                previous = t.indexOf(s.charAt(i));
                list.add(previous);
            } else {
                int index = t.indexOf(s.charAt(i), list.get(list.size() - 1) + 1);
                if (index == -1) {
                    result = false;
                    return result;
                } else {
                    list.add(index);
                }
            }
        }
        for (int i = list.size() - 1; i > 0; i++) {
            if (list.get(i) <= list.get(i - 1)) {
                result = false;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "leeetcode";
        String t = "yyyyyyyyyyyyleeetcode";
        System.out.println(solution(s, t));
    }

}

