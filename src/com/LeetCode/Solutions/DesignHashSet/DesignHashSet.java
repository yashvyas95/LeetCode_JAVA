package com.LeetCode.Solutions.DesignHashSet;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class DesignHashSet {
    /**
     * Initialize your data structure here.
     */
    //ArrayList<Integer> list;
    Set<Integer> Set;

    public DesignHashSet() {
        this.Set = new TreeSet<>();
    }

    public void add(int key) {
        if (!contains(key)) {
            this.Set.add(key);
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            this.Set.remove(key);
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return this.Set.contains(key);
    }


    public static void main(String[] args) {
        DesignHashSet set = new DesignHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));

    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

