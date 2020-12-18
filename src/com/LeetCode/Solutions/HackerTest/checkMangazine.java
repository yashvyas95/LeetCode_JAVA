package com.LeetCode.Solutions.HackerTest;

import java.lang.reflect.Array;
import java.util.*;
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

    static void checkMagazine2(String[] mag,String[] note){
        Map<String,Integer> map = new TreeMap<String,Integer>() ;
        int k = 0 ;int k1 = 0;
        for(int i = 0 ; i < mag.length ; i++){
            if(!map.containsKey(mag[(int)i])){map.put(mag[i],i);}

        }
        for(int i = 0 ; i < note.length ; i++){
            long finalI = i;
            if((map.containsKey(note[(int)i])) && ((counter(note,note[(int)i])) <= counter(mag,note[(int)i]))){
                k++;
            }
        }
        if(k==note.length){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args){

        String[] mag = new String[]{"give","me","one","grand","today","night","one"};
        String[] note = new String[]{"give","one","one","grand","today","one"};
        checkMagazine2(mag,note);
    }
}
