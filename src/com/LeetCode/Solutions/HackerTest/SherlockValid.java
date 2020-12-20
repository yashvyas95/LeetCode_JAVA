package com.LeetCode.Solutions.HackerTest;

import java.util.*;
import java.util.stream.Collectors;

public class SherlockValid {
    public static String isValid(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c1 : c) {
            if (!map.containsKey(c1)) {
                map.put(c1, 1);
            } else {
                map.put(c1, map.get(c1) + 1);
            }
        }
        List<Integer> list = map.values().stream().distinct().collect(Collectors.toList());
        int[] counts = new int[map.keySet().size()];
        int z = 0;int z1 = 0;
        boolean con = false;
        if (list.size() > 2) {
            return "NO";
        }
        else{
            if (list.size()==1){return "YES";}
            else{
                int max = Math.max(list.get(0),list.get(1));
                int min = Math.min(list.get(0),list.get(1));
                for(char i : map.keySet()){
                    if(map.get(i)==min){
                        z++;
                    }
                    else{
                        z1++;
                    }
                }
                if(z==1 ||  z1==1 ){
                    if(list.get(1)-list.get(0)==1||list.get(0)-list.get(1)==1 || list.get(1)==list.get(0)+1 || list.get(0) == list.get(1)+1){
                        return "YES";
                    }
                    else{
                        return "NO";
                    }
                }
                else{
                    return "NO";
                }
            }

        }
    }
}

