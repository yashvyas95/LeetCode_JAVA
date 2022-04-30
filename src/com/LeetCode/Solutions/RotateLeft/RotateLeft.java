package com.LeetCode.Solutions.RotateLeft;

import java.util.ArrayList;

import java.util.*;

public class RotateLeft {
    public static void main(String[] args) {

        var ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        int d = 2;
        var x = rotateLeft(d, ls);
        x.stream().forEach(System.out::println);
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> returnList = null;
        List<List<Integer>> rr = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            if (i == 0) {
                returnList = rotateLeftRecursive(arr);
                rr.add(returnList);
            } else {
                returnList = rotateLeftRecursive(rr.get(0));
                rr.remove(0);
                rr.add(returnList);
            }
        }
        return rr.get(0);
    }

    public static List<Integer> rotateLeftRecursive(List<Integer> ls) {
        ArrayList<Integer> newList = new ArrayList<>();
        var temp = -1;

        for (int i = 0; i < ls.size(); i++) {
            var element = ls.get(i);
            var new_index = i - 1;
            if (new_index == -1) {
                new_index = ls.size() - 2;
                temp = element;
            } else {
                newList.add(new_index, element);
            }
            if (i == ls.size() - 1) {
                newList.add(temp);
            }
        }
        return newList;
    }

}