package Graph;

// link : https://leetcode.com/problems/number-of-provinces/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findCircleNum {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer, Set<Integer>> dict = new HashMap<>();
        int max = 0;
        for (int i = 0; i < isConnected.length; i++) {
            int[] city = isConnected[i];
            Set<Integer> connectedCities = new HashSet<>();
            for (int j = 0; j < city.length; j++) {
                if (j != i && isConnected[i][j] == 1) {
                    connectedCities.add(j);
                    if (dict.containsKey(j)) {
                        Set<Integer> indirectConnected = dict.get(j);
                        connectedCities.addAll(indirectConnected);
                    }

                    max = Math.max(connectedCities.size(), max);
                }
            }
            dict.put(i, connectedCities);
        }

        if (max == isConnected.length) return 1;
        else if (max == 1) return isConnected.length - 1;
        else if (max == 0) return isConnected.length;
        else {
            int res = 0;
            for (Set<Integer> set : dict.values()) {
                if (set.size() == 0) res++;
            }
        }

        return max;
    }
}
