package com.LeetCode.Solutions.Anagrams;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

    public static void main(String[] args) {

        String s = "ifailuhkqq";
        var x = sherlockAndAnagrams(s);
    }

    public static int sherlockAndAnagrams(String s) {
        int result = 0;
        int length = 0;
        for (int i = 1; i <= s.length(); i++) {
            length += i;
        }

        String[] words = new String[length];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currSubStr = s.substring(i, j);
                words[index] = currSubStr;
                index++;
            }
        }

        for (int i = 0; i < words.length; i++) {
            String firstWord = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String secondWord = words[j];
                if (areAnagrams(firstWord, secondWord)) {
                    result++;
                }
            }
        }

        return result;
    }

    private static boolean areAnagrams(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] firstChars = firstWord.toCharArray();
        char[] secondChars = secondWord.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        for (int i = 0; i < firstChars.length; i++) {
            if (firstChars[i] != secondChars[i]) {
                return false;
            }
        }

        return true;
    }
}
// Write your code here
        /*
        HashMap<Character,Integer> counts = new HashMap<>();
        if(s.length() == 1){
            return 1;
        }
        else{
                for(char c : s.toCharArray()){
                     if(counts.containsKey(c)){
                         counts.put(c,counts.get(c)+1);
                     }
                     else{
                         counts.put(c,1);
                     }
                }
            }

        return 0;
    }

         */

