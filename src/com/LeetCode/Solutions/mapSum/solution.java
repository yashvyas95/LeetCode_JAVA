package com.LeetCode.Solutions.mapSum;

import com.LeetCode.Solutions.TagContentExtractor.Solution;

import java.util.HashMap;
import java.util.Map;

public class solution {

    public static void main(String[] args) {
        MapSum m = new MapSum();
        m.insert("apple", 3);
        m.insert("ap", 2);
        System.out.println(m.sum("ap"));

    }
}

class MapSum {
    HashMap<String, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        this.map = new HashMap<String, Integer>();
    }

    public void insert(String key, int val) {
        this.map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        var set = map.keySet();
        boolean flag = true;
        for (String s : set) {
            if (s.startsWith(prefix)) {
                sum += map.get(s);
            }
        }
        return sum;
    }
}