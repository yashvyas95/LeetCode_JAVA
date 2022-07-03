package com.LeetCode.Solutions.passwordStrength;
import java.util.*;
public class solution {


    /*
     * Complete the 'findPasswordStrength' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING password as parameter.
     */
    // TIME COMPLEXITY : (O)(N)
    public static long findPasswordStrength(String password) {

        long strength = 0;
        long cur = 0;
        long[] pos = new long[26];
        for (int i = 0; i < password.length(); i++) {
            cur += i + 1 - pos[password.charAt(i) - 'a'];
            pos[password.charAt(i) - 'a'] = i + 1;
            strength += cur;
        }
        return strength;
    }


    public static void main(String[] args) {
        String s = "good";
        System.out.println(findPasswordStrength(s));
    }


}
