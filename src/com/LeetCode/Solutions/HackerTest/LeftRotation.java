package com.LeetCode.Solutions.HackerTest;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        int d = 4;
        int[] b = rotLeft(a,d);
        System.out.println(b.toString());
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    static int[] rotLeft(int[] a , int d){
        int[] b = Arrays.copyOfRange(a,0,d);
        int[] c = Arrays.copyOfRange(a,d,a.length);
        int[] e = new int[a.length];
        int k = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(i < c.length){
                e[i] = c[i];
            }
            else{
                e[i] = b[k];
                k++;
            }
        }
        return e;
    }
    static int[] rotLeft2(int[] a, int d){
        /* To handle if d >= n */
        d = d % a.length;
        int i, j, k, temp;
        int g_c_d = gcd(d, a.length);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = a[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= a.length)
                    k = k - a.length;
                if (k == i)
                    break;
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
        return a;
    }
}
