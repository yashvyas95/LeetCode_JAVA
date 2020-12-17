package com.LeetCode.Solutions.HackerTest;
import java.util.Arrays;
import java.util.OptionalDouble;

public class MatrixHourGlass {
    public static int sumMatrix(int[][] arr){
        int sum = 0;
        int[] sumAll = new int[16];
        int z = 0 ;
        for(int i = 1 ; i < 5 ;i++){
            for(int j = 1 ; j < 5 ; j++ ){
                sum = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                sumAll[z] = sum;
                z++;

            }
        }
        double max = Arrays.stream(sumAll).asDoubleStream().max().getAsDouble();

        return (int)max;
    }

    public static void main(String[] args){
        int[][] a = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        int sum = sumMatrix(a);

        System.out.println(sum);
    }
}
