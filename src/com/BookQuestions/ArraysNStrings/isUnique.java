package com.BookQuestions.ArraysNStrings;

public class isUnique {
    /*
    1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
        cannot use additional data structures?
    * */

    public static void main(String[] args){
        String test = new String("abcda");
        System.out.println(isUnique(test));
    }

    // O(n) - > TimeComplexity
    // O(1) - > SpaceComplexity
    public static boolean isUnique(String s){

        for(int i = 0 ; i < s.length()-1; i++)
        {
            char c = s.charAt(i);
            if(s.indexOf(c,i+1)!=-1)
                return false;
        }

        return true;
    }


}
