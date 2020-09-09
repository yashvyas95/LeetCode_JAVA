package com.LeetCode.Solutions.NumeralsRoman;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumeralsRoman {
    public static int RomanToInt(String s){

        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        ArrayList<Character> Big_Container = new ArrayList<Character>(Arrays.asList('I','V','X','L','C','D','M'));
        int total_value = 0;
        int valueIndex = -1;
        for(int index = 0 ; index < s.length() ; index++){
            Character c = s.charAt(index);
            if(c == Big_Container.get(0) || c == Big_Container.get(2) || c == Big_Container.get(4))
            {
                if(c == 'I' && index!= s.length()-1)
                {
                        if (s.charAt(index + 1) == 'V') {
                            total_value += 4;
                            index++;
                        } else if (s.charAt(index + 1) == 'X') {
                            total_value += 9;
                            index++;
                        }
                        else{
                            total_value+=values[get_Index(c)];
                        }
                }
                else if(c == 'X' && index!= s.length()-1){
                    if(s.charAt(index+1) == 'L' && index != s.length()-1){
                        total_value+=40;
                        index++;
                    }
                    else if(s.charAt(index+1) == 'C' && index != s.length()-1){
                        total_value+=90;
                        index++;
                    }
                    else{
                        total_value+= values[get_Index(c)];
                    }
                }
                else if(c == 'C' && index!= s.length()-1){
                    if(s.charAt(index+1) == 'D' && index != s.length()-1){
                        total_value+=400;
                        index++;
                    }
                    else if(s.charAt(index+1) == 'M' && index != s.length()-1){
                        total_value+=900;
                        index++;
                    }
                    else{
                        total_value+= values[get_Index(c)];
                    }
                }
                else{
                    total_value+=values[get_Index(c)];
                }

            }
            else{
                total_value+=values[get_Index(c)];
            }
        }


        return total_value;
    }
    public static int get_Index(Character c){
        int index = -1;
        switch(c){
            case 'I':
                index = 0;
                break;
            case 'V':
                index = 1;
                break;
            case 'X':
                index = 2;
                break;
            case 'L':
                index = 3;
                break;
            case 'C':
                index = 4;
                break;
            case 'D':
                index = 5;
                break;
            case 'M':
                index = 6;
                break;

        }
        return index;
    }
}
