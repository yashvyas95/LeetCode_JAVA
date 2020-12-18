package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class twoStrings {
    static String twoStrings(String s1, String s2) {
        var z = s1.getBytes();
        var z1 = s2.getBytes();
        ArrayList<String> a = new ArrayList<>();
        String resl = "";
        int k = 0;
        for(int i = 0 ; i < Math.min(s1.length(),s2.length());i++){
            for(int j = 0 ; j < s2.length() ; j++){
            if(z[i] == z1[j]){
                resl = resl+z1[j];
                k++;
            }
            }
        }
        return resl;
    }
    public static void main(String[] args){
        String a = "ac";
        String b = "bad";
        System.out.println(twoStrings(a,b));
    }
}
