package com.LeetCode.Solutions.companyNameSubsetList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class subsetCompanyName {
    public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> indexes = new ArrayList<>();
        boolean flag = true;
        for (List<String> s : favoriteCompanies) {
            for (int i = 0; i < favoriteCompanies.size(); i++) {
                if (favoriteCompanies.get(i).containsAll(s) && favoriteCompanies.get(i) != s) {
                    flag = false;
                    break;
                } else {
                    if (flag && i == favoriteCompanies.size() - 1) {
                        indexes.add(favoriteCompanies.indexOf(s));
                        flag = true;
                    }
                }
            }
            flag = true;
        }
        return indexes;
    }

    public static void main(String[] args) {
        List<List<String>> input = new ArrayList<>();
//[["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
        var temp = new ArrayList<String>();
        temp.add("leetcode");
        temp.add("google");
        temp.add("facebook");
        input.add(temp);
        temp = null;
        temp = new ArrayList<String>();
        temp.add("google");
        temp.add("microsoft");
        input.add(temp);
        temp = null;
        temp = new ArrayList<String>();
        temp.add("google");
        temp.add("facebook");
        input.add(temp);
        temp = null;
        temp = new ArrayList<String>();
        temp.add("google");
        input.add(temp);
        temp = null;
        temp = new ArrayList<String>();
        temp.add("amazon");
        input.add(temp);
        temp = null;
        peopleIndexes(input);
    }

}
