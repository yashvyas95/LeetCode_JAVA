package com.LeetCode.Solutions.assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {
    public static void main(String[] args){
        String[] array = new String[]{"A","B","C"};
        List<String> L1 = Arrays.asList(array);
        List<String> L2 = new ArrayList<>(Arrays.asList(array));
        List<String> L3 = new ArrayList<>(Arrays.asList("A",new String("B"),"C"));
        System.out.println(L1.equals(L2));
        System.out.println(L1.equals(L3));
    }
}
