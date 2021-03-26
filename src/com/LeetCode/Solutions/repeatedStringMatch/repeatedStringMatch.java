package com.LeetCode.Solutions.repeatedStringMatch;

public class repeatedStringMatch {
    public static int solution(String s1, String s2) {
        boolean flag = true;
        int result = -1;
        if (s1.contains(s2)) {
            return 1;
        } else {
            if (s1.length() == 1 && s2.length() == 1 && flag) {
                return 1;
            } else {
                int mul_factor = s2.length() / s1.length();
                String temp = new String(s1);
                for (int i = 1; i < mul_factor + 10; i++) {
                    if (temp.contains(s2)) {
                        result = i;
                        break;
                    }
                    temp = temp.concat(s1);
                }
                return result;
            }

        }
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bca";
        System.out.println(solution(s1, s2));
    }
}
