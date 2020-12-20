package com.LeetCode.Solutions.HackerTest;


import java.util.Arrays;

public class greedyFlorist {
    public static int getMinimumCost(int k, int[] c) {
        int rounds = 0;
        int[] friends = new int[k];
        int total = 0;
        boolean con = true;
        int l =  c.length-1;
        c  = Arrays.stream(c).sorted().toArray();
        if(k == c.length || k > c.length){
            for(int i : c){
                total+=i;
            }
        }
        else {
            while (con)
            {
                {
                    for (int i = k - 1; i >= 0; i--) {
                        friends[i] = c[l];
                        if(rounds==0) {
                            total += friends[i];
                        }
                        else{
                            total += (1+rounds)*c[l];
                        }
                        if (l == 0) {
                            con = false;
                            break;
                        } else {
                            l--;
                        }
                    }
                }

                rounds++;
            }
        }
        return total;
    }
}
