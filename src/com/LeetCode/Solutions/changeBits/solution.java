package com.LeetCode.Solutions.changeBits;

public class solution {
    static int[] changeBits(int N) {
        // code here
        int[] res = new int[2];
        String binaryrep = Integer.toBinaryString(N);
        String newbinaryRep = binaryrep.replace('0','1');
        Integer newNumber = Integer.parseInt(newbinaryRep,2);
        res[1] = newNumber;
        res[0] =Math.abs(N-newNumber);
        return res;
    }
    public static void main(String[] args){
        int N = 8;
        changeBits(N);
    }
}
