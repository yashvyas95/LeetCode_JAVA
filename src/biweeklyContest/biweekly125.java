package biweeklyContest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class biweekly125 {

    //https://leetcode.com/contest/biweekly-contest-125/problems/minimum-operations-to-exceed-threshold-value-i/
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k)
                return i;
        }
        return 0;
    }

    //https://leetcode.com/contest/biweekly-contest-125/problems/minimum-operations-to-exceed-threshold-value-ii/
    public static int minOperations2(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayDeque<Integer> ls = new ArrayDeque<>();
        for (int i : nums)
            ls.add(i);

        int res = 0;
        while (ls.size() != 0) {
            int min1 = ls.pop();
            int min2 = ls.peek();
            if (min1 >= k && min2 >= k)
                return res;
            int replacement = Math.min(min1, min2);
            replacement = (replacement * 2) + Math.max(min1, min2);
            // ls.stream().sorted().
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2, 11, 10, 1, 3};
        int k = 10;
        int tst = minOperations2(nums, k);
        System.out.println(tst);
    }


}
