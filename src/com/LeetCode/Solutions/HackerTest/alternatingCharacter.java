package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class alternatingCharacter{
    public static int alternatingCharactersmethod(String s) {
        int counter=0;
        for(int i = 0 ; i < s.length() ; i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                counter++;
            }
        }
        return counter;
    }
}
