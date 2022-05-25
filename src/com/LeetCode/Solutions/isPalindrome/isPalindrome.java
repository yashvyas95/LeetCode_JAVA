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
    public static boolean validPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.strip().charAt(s.length()-1-i))))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }
}
