package com.LeetCode.Solutions.minSwaps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class minSwaps {

    public static int solution(String s1, String s2) {
        int xyMismatches = 0, yxMismatches = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xyMismatches++;
            }
            if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                yxMismatches++;
            }
        }
        int total = xyMismatches / 2 + yxMismatches / 2;
        int remXy = xyMismatches % 2;
        int remYx = yxMismatches % 2;
        if (remXy != remYx) {
            return -1;
        }
        total += (remXy * 2);
        return total;
    }

    public static void main(String[] args) {
        System.out.println(solution("xxyyxyxyxx", "xyyxyxxxyx"));
    }
}


