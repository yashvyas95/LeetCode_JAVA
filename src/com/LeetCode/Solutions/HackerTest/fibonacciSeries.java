package com.LeetCode.Solutions.HackerTest;

public class fibonacciSeries {
    public static int fibonacci(int n) {
        // Complete the function.
            return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2);
    }


}
