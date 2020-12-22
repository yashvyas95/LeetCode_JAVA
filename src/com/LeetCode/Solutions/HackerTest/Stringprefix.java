package com.LeetCode.Solutions.HackerTest;

import java.util.*;
import java.util.stream.Collectors;

public class Stringprefix {
    public static List<Integer> commonPrefix(List<String> inputs) {
        // Write your code here
        //int[] commonLength = new long[inputs.size()-1];
        List<Integer> result = new ArrayList<>();
        //int a = Integer.parseInt(inputs.get(0));
           result.add(findLengthCommon(inputs.get(0)));

            return result;
    }
    public static int findLengthCommon(String s){
        String b;
        int[] commonLength = new int[s.length()];
        commonLength[0]=s.length();
        ArrayList<Character> characters = new ArrayList<>();
        char[] chars = new char[s.length()];
        int k = 1;int j = 0;
        if(s.length()>1){
            for(char c : s.toCharArray()){
                chars[j] = s.charAt(j);
                if(k < s.length()) {
                    commonLength[k] = findsuffix(String.copyValueOf(chars), s.substring(k, s.length()));
                    k++;
                    j++;
                }
            }
        }


        return Arrays.stream(commonLength).sum();
    }
    public static int findsuffix(String a , String b){
            int counter = 0;
            if(a.length()!=0 && b.length()!=0){
                if(a.charAt(0)==b.charAt(0)){
                    boolean condition = true;
                    int k = 0;
                    while(condition && k<a.length() && k<b.length()){
                        if(a.charAt(k)==b.charAt(k)){
                            counter++;
                               k++;
                        }
                        else{
                            condition=false;
                        }
                    }
                }
            }

            return counter;
    }
    public static void main(String[] args){
        String a = "abcabcd";

        System.out.println(findLengthCommon(a));
    }
}
