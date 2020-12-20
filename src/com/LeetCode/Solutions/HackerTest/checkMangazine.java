package com.LeetCode.Solutions.HackerTest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class checkMangazine {
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String,Integer> mag = new HashMap<>();
        HashMap<String,Integer> no = new HashMap<>();
        boolean con = false;
        Integer occur ;
        for(String s : magazine){
            occur = mag.get(s);
            if(occur==null){
                mag.put(s,1);
            }
            else{
                mag.put(s,occur+1);
            }
        }
        for(String s : note){
            occur = no.get(s);
            if(occur==null){
                no.put(s,1);
            }
            else{
                no.put(s,occur+1);
            }
        }
        for(String s : note){
            if(!mag.containsKey(s) || mag.get(s) < no.get(s)){
                con = true;
                break;
            }
        }
        if(con == true){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
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
    static void checkMagazine3(String[] mag, String[] note){

    }


    public static void main(String[] args){

        String[] mag = new String[]{"give","me","one","grand","today","night"};
        String[] note = new String[]{"give","one","grand","today"};
        checkMagazine(mag,note);
    }
}
