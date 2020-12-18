package com.LeetCode.Solutions.HackerTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class checkMangazine {
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<Integer, String> c = new Hashtable<>();
        int counter=0;int counter1=0;
        for(String n : magazine){
            c.put(counter,n);
            counter++;
        }
        for(String l : note){
            if(c.containsValue(l)){
                if((counter(note,l)<=counter(magazine,l))){
                    counter1++;
                }
            }
            else{
                break;
            }
        }
        if(counter1==note.length){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    static int counter(String[] collec,String target){
        int result = 0;
        for(String i : collec){
            if(i == target) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args){

        String[] mag = new String[]{"give","me","one","grand","today","night"};
        String[] note = new String[]{"give","one","grand","today"};
        checkMagazine(mag,note);
    }
}
