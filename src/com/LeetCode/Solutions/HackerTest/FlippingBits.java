package com.LeetCode.Solutions.HackerTest;

public class FlippingBits {
    public static long flippingBits(long n) {
        String nStr = Long.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        if(nStr.length()<32){
                for(int i = 0 ; i < 32-nStr.length() ; i++){sb.append('0');}
                sb.append(nStr);
        }
        char[] nnStr = new char[32];
        for(int i = sb.length()-1 ; i>=0 ; i--){
            nnStr[i]=(sb.charAt(i)=='0')?'1':'0';
        }
        return Long.parseLong(String.valueOf(nnStr),2);
    }

}
