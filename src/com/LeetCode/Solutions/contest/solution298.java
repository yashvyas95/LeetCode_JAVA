package com.LeetCode.Solutions.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class solution298 {
    public static String greatestLetter(String s) {
        String scopy = new String(s);
        int result = -1;
        for(char c : s.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                int index = s.indexOf(Character.toUpperCase(c));
                if(index!=-1)
                {
                    result = Math.max(result,(int)c);
                }
            }
        }
        if(result==-1)
            return "";
        return String.valueOf(Character.toUpperCase((char)(result)));
    }

    public static int minimumNumbers(int num, int k) {
        if (num==0)
            return 0;
        for (int i=1; i<=100; ++i) {
            if (k*i<=num&&(k*i)%10==num%10) {
                return i;
            }
        }
        return -1;
    }

    public static int longestSubsequence(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s  = sb.toString();
        int ans=0;
        for (int i=0; i<s.length(); ++i) {
            if (s.charAt(i)=='0')
                ++ans;
            else if (i<30) {
                if (k>=(1<<i)) {
                    ++ans;
                    k-=(1<<i);
                }
            }
        }
        return ans;
    }
    public static long sellingWood(int m, int n, int[][] prices) {
        long[][] map = new long[m + 1][n + 1], dp = new long[m + 1][n + 1];
        for (int[] price : prices) {
            map[price[0]][price[1]] = price[2];
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = map[i][j];
                for (int k = 1; k < i; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[k][j] + dp[i - k][j]);
                }
                for (int k = 1; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[i][j - k]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args){
        int m = 3, n = 5;
        int[][] prices = new int[][]{{1,4,2}, {2,2,7}, {2,1,3}};
        String s = "00101001";
        System.out.println(sellingWood(m,n,prices));
    }
}
