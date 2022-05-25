package com.algoDesignQuestion;

import java.util.Arrays;

public class p2 {
/**
 * Suppose you have an array A of size n.
 * You want to sort the array in increasing order,
 * but you don’t have access to the normal ‘write’ operation
 * (in other words, the process by which you sort this array
 * is going to be very different from the sorting algorithms
 * you’re used to). You can only use a constant amount of space
 * other than the memory already used by the array. The only operation
 * that you can call directly on the array is Reverse(k).
 * This operation takes the first k elements of the array (A[1]…A[k])
 * and reverses them in the array. For example, if A = [1,4,3,2,5] and
 * you call Reverse(3), you get A = [3,4, 1, 2,5]. Reverse always flips
 * the first k elements of the array.
 * Design an algorithm to sort the array with O(n) calls to Reverse
 * (you don’t need to find the algorithm that makes the fewest calls-
 * which would be a very difficult problem- as long as it make O(n) calls, it’s fine).
 * Exactly how many calls to Reverse does your algorithm require? Explain your answer.
 * Hint: try a few examples by hand.
 * */
    public int[] reverse(int elementNumber){

        return null;
    }

    public static int[] algo(int[] arr){
        if(arr.length<2)return null;
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        if(arr==arr2){
            System.out.println("No steps are required");
        }
        else{
            if(arr.length%2==0){
                // Aim : to get array in decreasing fashion

            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] a = {1,2,4,3};

    }
}
