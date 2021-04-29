package com.LeetCode.Solutions.MakeSumDivisible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MakeSumDivisible {

    public static int minSubarray(int[] nums, int p) {
        var sum = 0L;
        ArrayList<Integer> x = new ArrayList<>();
        Collections.sort(x);
        for (var num : nums) sum += num;
        var r = (int) (sum % p);
        if (r == 0) return 0;
        if (sum < p) return -1;
        sum = 0L;
        var rs = new HashMap<Integer, Integer>();
        rs.put(0, -1);
        int min = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            var k = (int) (sum % p);
            var d = k - r;
            if (d < 0) d += p;
            var prev = rs.get(d);
            if (prev != null) min = Math.min(min, i - prev);
            if (min == 1) return min;
            rs.put(k, i);
        }
        return min < nums.length ? min : -1;
    }

    public static void main(String[] args) {
        int[] nums = {6, 3, 5, 2, 9};
        int p = 9;
        System.out.println(minSubarray(nums, p));
    }
}
