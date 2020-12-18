package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class twoStrings {
        static String twoStrings(String s1, String s2) {
            boolean result = false;
            HashSet<Character> c = new HashSet<>();
            int k = 0;
            for(char c1 : s1.toCharArray()){
                c.add(c1);
            }
            for(char c2 : s2.toCharArray()){
                if(c.contains(c2)){
                    result = true;
                }
            }
            if(result){return "YES";}
            else{return "NO";}
        }
    public static void main(String[] args){
        String a = "hiw";
        String b = "world";
        System.out.println(twoStrings(a,b));
    }
}
