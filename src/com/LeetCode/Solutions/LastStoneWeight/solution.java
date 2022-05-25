package com.LeetCode.Solutions.LastStoneWeight;
import java.util.*;

public class solution {

    static Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

    public static int lastStoneWeight(int[] stones) {
        if(stones.length==1)return stones[0];
        if(stones.length==0)return 0;
        for(int i: stones){
            q.offer(i);
        }
        while(q.size()>1){
            int s1 = q.poll();
            int s2 = q.poll();
            if(s1-s2!=0)q.offer(Math.abs(s1-s2));
        }
        if(q.size()==0)return 0;
        return q.poll();
    }

    public static void main(String[] args){
            var stones = new int[]{2,7,4,1,8,1};
            lastStoneWeight(stones);
    }

}
