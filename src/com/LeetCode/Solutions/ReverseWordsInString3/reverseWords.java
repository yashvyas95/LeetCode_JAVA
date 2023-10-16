package com.LeetCode.Solutions.ReverseWordsInString3;

import java.util.Arrays;
import java.util.HashMap;

public class reverseWords {
    public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] result = new int[people.length];
        int index = 0;
        for (int i : people) {
            result[index++] = checkOverlappingBloom(flowers, i);
        }
        return result;
    }

    public static int checkOverlappingBloom(int[][] flowers, int time) {
        int numOfFlowersInBloom = 0;
        Arrays.sort(flowers, (a, b) -> a[0] - b[0]);
        for (int[] flower : flowers) {
            numOfFlowersInBloom = (flower[0] <= time && time <= flower[1]) ? numOfFlowersInBloom + 1 : numOfFlowersInBloom;
            if (flower[0] > time) break;
        }
        return numOfFlowersInBloom;
    }

    public static void main(String[] args) {
        int[][] flowers = new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}};
        int[] people = new int[]{2, 3, 7, 11};

        System.out.println(fullBloomFlowers(flowers, people));
    }
}