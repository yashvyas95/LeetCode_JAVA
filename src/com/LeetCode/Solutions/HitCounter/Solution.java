package com.LeetCode.Solutions.HitCounter;

import java.util.LinkedList;

public class Solution {
    private int total;
    private LinkedList<Pair> hits;

    public Solution() {
        this.total = 0;
        this.hits = new LinkedList<>();
    }

    public void hit(int timestamp) {
        if (this.hits.isEmpty() || this.hits.getLast().timeStamp != timestamp) {
            this.hits.add(new Pair(timestamp, 1));
        } else {
            int prevCount = this.hits.getLast().count;
            this.hits.removeLast();
            this.hits.add(new Pair(timestamp, prevCount + 1));
        }
        this.total++;
    }

    public int getHits(int timestamp) {
        while (!this.hits.isEmpty()) {
            int diff = timestamp - this.hits.getFirst().timeStamp;
            if (diff >= 300) {
                this.total -= this.hits.getFirst().count;
                this.hits.removeFirst();
            }
            else break;
        }
        return this.total;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.hit(1);
        s.hit(2);
        s.hit(300);
        s.hit(300);
        s.getHits(300);
        s.getHits(301);
    }
    class Pair{
        int timeStamp;
        int count;
        public Pair(){}
        public Pair(int timeStamp,int count){
            this.timeStamp = timeStamp;
            this.count = count;
        }
    }
}
