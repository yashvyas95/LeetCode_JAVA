package com.LeetCode.Solutions.LongestCommonPrefx;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
//import java.util.stream.Collectors;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length>1){
            int[] min_length_string = findSmallestLength(strs);
            List<String> common = new ArrayList<String>();
            if(min_length_string[0]==0){return "";}
            else{
                if(min_length_string[0]==1){
                    String tobereturned = String.valueOf(strs[min_length_string[1]]);
                    boolean condtition_in = true;
                    for(String s : strs){
                        if(!tobereturned.equals(String.valueOf(s.charAt(0)))){
                            condtition_in = false;
                        }
                    }
                    if(condtition_in == false)
                        return "";
                    else
                        return tobereturned;
                }
                else{
                    boolean condition = true;
                    for(int i = 0 ; i < min_length_string[0] ; i++){
                        for(int j = 0 ; j < strs.length ; j++){
                            if(strs[0].charAt(i) == strs[j].charAt(i) && condition == true){
                                if(j == strs.length-1){
                                    common.add(String.valueOf(strs[0].charAt(i)));
                                }
                            }
                            else{condition=false;}
                        }
                    }
                    StringBuilder builder = new StringBuilder();
                    for(String s : common){
                        builder.append(s);
                    }
                    return builder.toString();
                }
            }
        }
        else{
            if(strs.length == 1){return strs[0];}
            else{return "";}
        }

    }
    public static int[] findSmallestLength(String[] strs){
        int[] minimum_finded = new int[2];
        minimum_finded[0] = strs[0].length();
        minimum_finded[1] = 0;
        int index = 0;
        for(String s : strs){
            if(minimum_finded[0] >= s.length()){
                minimum_finded[0] = s.length();
                minimum_finded[1] = index;
            }
            index++;
        }

        return minimum_finded;
    }
}
