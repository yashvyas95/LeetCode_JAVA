package com.LeetCode.Solutions.maxProfit;

class solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length ; i++)
        {
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if(prices[i] - minPrice > ans)
                ans = prices[i] - minPrice;
        }
        return ans;
    }
}
