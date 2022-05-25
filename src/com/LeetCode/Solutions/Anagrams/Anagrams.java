package com.LeetCode.Solutions.Anagrams;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

    public static void main(String[] args) {

        String s = "aacc";
        var x = "ccac";
        bestSolution(s,x);
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

    public static boolean isAnagram(String s , String t){
        var char_array = s.toCharArray();
        var char_array2 = t.toCharArray();
        HashMap<Character,Integer> map = new HashMap();

        if(char_array.length!=char_array2.length)
            return false;

        //BIG_o(n)
        for(char c : char_array){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int temp_length = char_array.length;
        //Big o(n)
        for(char c : char_array2){
            if(!map.containsKey(c))
                return false;
            else{
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){map.remove(c);}

            }

        }

        if(map.size()>0)
            return false;
        return true;
    }

    public static boolean bestSolution(String s , String t){
        int[] map = new int[26];
        for(char c : s.toCharArray()){
            map[c-'a'] += 1;
        }
        for(char c : t.toCharArray()){
            map[c-'a'] -= 1;
        }

        for(int i : map){
            if( i != 0){
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

