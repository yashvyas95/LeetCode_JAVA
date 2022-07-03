package com.LeetCode.Solutions.contest;

import java.util.Arrays;

public class solution299 {
    public static boolean checkXMatrix(int[][] grid) {
        boolean result = true;

        for(int i = 0 ; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // dia1
                int element = grid[i][j];
                if (i == j && element == 0)
                    result = false;
                    // diag 2
                else if (i + j == grid.length - 1 && element == 0)
                    result = false;
                else if (i != j && i + j != grid.length - 1 && element != 0)
                    result = false;
            }
        }
        return result;
    }

    public static int countHousePlacements(int N) {
        if (N == 1)
            return 4;

        int countB=1, countS=1, prev_countB, prev_countS;

        for (int i=2; i<=N; i++)
        {
            prev_countB = countB;
            prev_countS = countS;

            countS = prev_countB + prev_countS;
            countB = prev_countS;
        }

        long result = countS + countB;
        double resultTemp = Math.pow(result,2);
        resultTemp = resultTemp%(Math.pow(10,9)+7);
        return ((int)resultTemp);
    }

    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long[] c1 = new long[n+1];
        for(int i = 0;i < n;i++){
            c1[i+1] = c1[i] + nums1[i];
        }
        long[] c2 = new long[n+1];
        for(int i = 0;i < n;i++){
            c2[i+1] = c2[i] + nums2[i];
        }
        long ans = Math.max(c1[n], c2[n]);
        {
            long min = 0;
            for(int i = 0;i <= n;i++){
                min = Math.min(min, c2[i] - c1[i]);
                ans = Math.max(ans, c2[i] - c1[i] - min + c1[n]);
            }
        }
        {
            long min = 0;
            for(int i = 0;i <= n;i++){
                min = Math.min(min, c1[i] - c2[i]);
                ans = Math.max(ans, c1[i] - c2[i] - min + c2[n]);
            }
        }
        return (int)ans;
    }
    public int minimumScore(int[] nums, int[][] edges) {
        int n = nums.length;
        int[] from = new int[n-1];
        int[] to = new int[n-1];
        for(int i = 0;i < n-1;i++){
            from[i] = edges[i][0];
            to[i] = edges[i][1];
        }
        int X = 0;
        for(int v : nums)X ^= v;
        int[][] g = packU(n, from, to);
        int[][] pars = parents(g, 0);
        int[] par = pars[0], ord = pars[1], dep = pars[2];
        int[] dp = new int[n];
        for(int i = n-1;i >= 0;i--){
            int cur = ord[i];
            dp[cur] = nums[cur];
            for(int e : g[cur]){
                if(par[cur] == e)continue;
                dp[cur] ^= dp[e];
            }
        }

        boolean[][] anc = new boolean[n][n]; // c a
        for(int i = 0;i < n;i++){
            for(int x = i;x != -1;x = par[x]){
                anc[i][x] = true;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(anc[i][j]){
                    int[] u = {dp[i], dp[j] ^ dp[i], X ^ dp[j]};
                    Arrays.sort(u);
                    min = Math.min(min, u[2] - u[0]);
                }else if(anc[j][i]){
                    int[] u = {dp[j], dp[i] ^ dp[j], X ^ dp[i]};
                    Arrays.sort(u);
                    min = Math.min(min, u[2] - u[0]);
                }else{
                    int[] u = {dp[j], dp[i], X ^ dp[i] ^ dp[j]};
                    Arrays.sort(u);
                    min = Math.min(min, u[2] - u[0]);
                }
            }
        }
        return min;
    }
    // 4th question
    public int[][] parents(int[][] g, int root) {
        int n = g.length;
        int[] par = new int[n];
        Arrays.fill(par, -1);

        int[] depth = new int[n];
        depth[0] = 0;

        int[] q = new int[n];
        q[0] = root;
        for (int p = 0, r = 1; p < r; p++) {
            int cur = q[p];
            for (int nex : g[cur]) {
                if (par[cur] != nex) {
                    q[r++] = nex;
                    par[nex] = cur;
                    depth[nex] = depth[cur] + 1;
                }
            }
        }
        return new int[][]{par, q, depth};
    }


    public int[][] packU(int n, int[] from, int[] to) {
        return packU(n, from, to, from.length);
    }

    public int[][] packU(int n, int[] from, int[] to, int sup) {
        int[][] g = new int[n][];
        int[] p = new int[n];
        for (int i = 0; i < sup; i++) p[from[i]]++;
        for (int i = 0; i < sup; i++) p[to[i]]++;
        for (int i = 0; i < n; i++) g[i] = new int[p[i]];
        for (int i = 0; i < sup; i++) {
            g[from[i]][--p[from[i]]] = to[i];
            g[to[i]][--p[to[i]]] = from[i];
        }
        return g;
    }
    //-------------------------

    public static void main(String[] args){
        int[][] a = new int[][] {{2,0,0,1}, {0,3,1,0}, {0,5,2,0},{4,0,0,2}};
        checkXMatrix(a);
        System.out.println(countHousePlacements(1000));

    }
}
