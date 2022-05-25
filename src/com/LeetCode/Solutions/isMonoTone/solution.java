package com.LeetCode.Solutions.isMonoTone;

import java.util.*;

public class solution {
    public static int minFlipsMonoIncr(String s) {
        int one = 0;
        int flip =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                one++;
            else
                flip++;
            flip = Math.min(one,flip);
        }
        return flip;
    }

    public static void main(String[] args){
         String s = new String("010110");
         int steps = minFlipsMonoIncr(s);
    }
}
