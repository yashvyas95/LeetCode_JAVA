package com.LeetCode.Solutions.kthLargestElement;

import java.util.PriorityQueue;

public class solution {

    int k;
    PriorityQueue<Integer> q;

    public solution(int k, int[] nums) {
        k = k;
        q = new PriorityQueue<>();

        for(int i : nums)
            q.offer(i);

        while(q.size() > k)
            q.poll();
    }

    public int add(int val) {
         q.offer(val);
         if(q.size()>k)
             q.poll();

         return q.peek();
    }

    public static void main(String[] args){
            new solution(3,new int[] {4,5,8,2});
    }

}
