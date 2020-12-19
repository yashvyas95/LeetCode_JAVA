package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class alternatingCharacter {
    static int alternatingCharacters(String s) {
        ArrayList<Character> c = new ArrayList<>();
        char[] a = s.toCharArray();
        int k = 0;
        int steps = 0;
        for (int i = 0 ; i < s.length() ; i++){
            k = i+1;
            if(k<s.length()-1){
                if(a[i]==a[k]){
                    steps++;
                    String temp = s.substring(k,s.length());
                    s = temp;
                    i=-1;
                }
            }

        }
        int k1 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            k1 = i+1;
            if(k<s.length()-1){
                if(a[i]==a[k1]){
                    steps++;
                    String temp = s.substring(k1,s.length());
                    s = temp;
                    i=-1;
                }
            }

        }
        return steps;
    }
    public static void main(String[] args){
        String a = "AAAA";
        System.out.println(alternatingCharacters(a));
    }
}
