package com.LeetCode.Solutions.HackerTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class stringAbbrevation {

    public static String abbreviation(String a, String b) {
        boolean[][] dp = new boolean[b.length() + 1][a.length() + 1];
        dp[0][0] = true;
        for (int j = 1; j < dp[0].length; j++) {
            if (Character.isLowerCase(a.charAt(j - 1))) dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                char ca = a.charAt(j - 1), cb = b.charAt(i - 1);
                if (ca >= 'A' && ca <= 'Z') {
                    if (ca == cb) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }else {
                    ca = Character.toUpperCase(ca);
                    if (ca == cb) dp[i][j] = dp[i - 1][j - 1] || dp[i][j - 1];
                    else dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[b.length()][a.length()] ? "YES" : "NO";
    }
    public static String abbreviation1(String a, String b) {
        HashMap<Character,Integer> set = new HashMap<>();
        HashMap<Character,Integer> set2 = new HashMap<>();
        int counter=0;
        boolean condition = false;
        for(char c : b.toCharArray()){
            if(set2.containsKey(c)){
                set2.put(c,set2.get(c)+1);
            }
            else{
                set2.put(c,1);
            }
        }
        for(char c : a.toCharArray()){
            if(set.containsKey(c)){
                set.put(c,set.get(c)+1);
            }
            else{
                set.put(c,1);
            }
        }
        for(char c : b.toCharArray()){
            if(set.containsKey(c) || set.containsKey(Character.toLowerCase(c))){condition=true;}
            else{
                condition=false;
                break;
            }
        }
        if(condition){for(char c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                if(set2.containsKey(c)){
                    if(set.get(c)==set.get(c)){condition=true;}
                }
                else{
                    condition = false;
                    break;
                }
            }
            else {
                if(set2.containsKey(Character.toUpperCase(c))){
                    int count = set2.get(Character.toUpperCase(c));
                    int count2;
                    if(set.containsKey(Character.toUpperCase(c))){count2 = set.get(Character.toUpperCase(c));}
                    else{count2=0;}
                    int count3 = set.get(c);
                    if(count <= count2+count3){
                        condition = true;
                    }
                    else{
                        condition = false;
                        break;
                    }
                }
            }
        }}
        if (!condition) {return "NO";} else {return "YES";}
    }
}
