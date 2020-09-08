package com.LeetCode.Solutions.isPalindrome;

public class isPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0) {
            return true;
        } else {
            String xstr = Integer.toString(x);
            StringBuilder builder = new StringBuilder();
            builder.append(xstr);
            if (xstr.equals(builder.reverse().toString())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
