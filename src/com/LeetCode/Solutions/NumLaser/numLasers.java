package com.LeetCode.Solutions.NumLaser;

/**
 * Anti-theft security devices are activated inside a bank. You are given a 0-indexed binary string array bank representing the floor plan of the bank, which is an m x n 2D matrix. bank[i] represents the ith row, consisting of '0's and '1's. '0' means the cell is empty, while'1' means the cell has a security device.
 * <p>
 * There is one laser beam between any two security devices if both conditions are met:
 * <p>
 * The two devices are located on two different rows: r1 and r2, where r1 < r2.
 * For each row i where r1 < i < r2, there are no security devices in the ith row.
 * Laser beams are independent, i.e., one beam does not interfere nor join with another.
 * <p>
 * Return the total number of laser beams in the bank.
 */
public class numLasers {
    // 0 -> no security device
    // 1 -> security device
    // condi -> there is one laser between 2 devices if
    // r1 < r2
    // r1 < i < r2 -> there is no security device
    class Solution {
        public int numberOfBeams(String[] bank) {
            int prevRowCount = 0;
            int total = 0;

            for (String row : bank) {
                int curRowCount = calc(row);
                if (curRowCount == 0)
                    continue;

                total += curRowCount * prevRowCount;
                prevRowCount = curRowCount;
            }
            return total;
        }

        private int calc(String s) {
            int count = 0;
            for (char c : s.toCharArray())
                count += c - '0';

            return count;
        }
    }
}
