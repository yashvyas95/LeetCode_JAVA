package com.LeetCode.Solutions.checkTriplet;

import java.util.HashMap;

public class solution {}
    /*
    static boolean checkTriplet(int[] arr, int n) {
        // code here
        HashMap<Double,Integer> map = new HashMap<>();

        for(  i : arr)
        {
            int count = map.getOrDefault(i*i,0);
            map.put(i*i,count+1);
        }

        for(int i = 0 ; i < n-1 ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                double num1 = arr[i]*arr[i];
                double num2 = arr[j]*arr[j];
                map.put(num1,map.get(num1)-1);
                map.put(num2,map.get(num2)-1);
                double num3 = (num1*num1 + num2*num2);
                if(map.containsKey(num3) && map.get(num3)>0)
                    return true;
                else{
                    map.put(num1,map.get(num1)+1);
                    map.put(num2,map.get(num2)+1);
                }

            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] a = new int[]{4,49,1,59,19,81,97,99,82,90,99,10,58,73,23};
        System.out.println(checkTriplet(a,15));
    }
}

     */
