package com.LeetCode.Solutions.Contest300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class solution {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static String decodeMessage(String key, String message) {
            HashMap<Character,Integer> keyMapping = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            String al = "abcdefghijklmnopqrstuvwxyz";
            int index = 0;
            for(char c : key.toCharArray())
            {
                if(!keyMapping.containsKey(c) && c!=' ')
                {
                    keyMapping.put(c,index++);
                }
            }

            for(char c : message.toCharArray()){
                 if(c!=' '){
                     int tempindex = keyMapping.get(c);
                     sb.append(al.charAt(tempindex));
                 }
                 else{
                     sb.append(c);
                 }

            }

            return sb.toString();
    }
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        int rows = m;
        int columns = n;
        int up = 0;
        int left = 0;
        int right = n - 1;
        int down = m - 1;
        int present = 0;
        while (present < m * n) {
            // Traverse from left to right.
            for (int col = left; col <= right; col++) {
                if(head!=null)
                {
                    result[up][col] = head.val;
                    head = head.next;
                }
                else
                    result[up][col] = -1;
                present++;
            }
            // Traverse downwards.
            for (int row = up + 1; row <= down; row++) {

                if(head!=null)
                {
                    result[row][right] = head.val;
                    head = head.next;
                }

                else
                    result[row][right] = -1;
                present++;
            }
            // Make sure we are now on a different row.
            if (up != down) {
                // Traverse from right to left.
                for (int col = right - 1; col >= left; col--) {
                    if(head!=null)
                    {
                        result[down][col] = head.val;
                        head = head.next;
                    }

                    else
                        result[down][col] = -1;
                    present++;
                }
            }
            // Make sure we are now on a different column.
            if (left != right) {
                // Traverse upwards.
                for (int row = down - 1; row > up; row--) {
                    if(head!=null)
                    {
                        result[row][left] = head.val;
                        head = head.next;
                    }

                    else
                        result[row][left] = -1;
                    present++;
                }
            }
            left++;
            right--;
            up++;
            down--;
        }

        return result;
    }
    public static int countPaths(int[][] grid) {
        Long dp[][] = new Long[grid.length][grid[0].length], count = 0L;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count = (count + countPaths(i, j, grid, dp)) % 1000000007;
            }
        }
        return count.intValue();
    }

    private static long countPaths(int i, int j, int[][] grid, Long[][] dp) {
        return dp[i][j] != null ? dp[i][j]
                : (dp[i][j] = (1 + (i > 0 && grid[i - 1][j] > grid[i][j] ? countPaths(i - 1, j, grid, dp) : 0)
                + (j > 0 && grid[i][j - 1] > grid[i][j] ? countPaths(i, j - 1, grid, dp) : 0)
                + (j < grid[0].length - 1 && grid[i][j + 1] > grid[i][j] ? countPaths(i, j + 1, grid, dp) : 0)
                + (i < grid.length - 1 && grid[i + 1][j] > grid[i][j] ? countPaths(i + 1, j, grid, dp) : 0))
                % 1000000007);
    }
    public static int peopleAwareOfSecret(int n, int delay, int forget) {
        int dp[][] = new int[n][forget], sum = 0;
        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = delay - 1; j < forget - 1; j++) {
                dp[i][0] = (dp[i][0] + dp[i - 1][j]) % 1000000007;
            }
            for (int j = 1; j < forget; j++) {
                dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % 1000000007;
            }
        }
        for (int j = 0; j < forget; j++) {
            sum = (sum + dp[n - 1][j]) % 1000000007;
        }
        return sum;
    }


    public static void main(String[] args){
            String key  = "the quick brown fox jumps over the lazy dog";
            String message = "vkbs bs t suepuv";
            System.out.println(decodeMessage(key,message));
            int m = 2, n = 4;
            ListNode n1 = new ListNode(0,new ListNode(1,new ListNode(2,null)));
            spiralMatrix(m,n,n1);
    }
}
