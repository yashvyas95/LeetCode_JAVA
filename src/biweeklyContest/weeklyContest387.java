package biweeklyContest;

import java.util.*;

public class weeklyContest387 {

    public static void main(String[] args) {
        // tester
        int[][] grid = new int[][]{{1, 1, 2}, {1, 1, 0}, {0, 1, 0}};
        int[][] g = new int[][]{{7, 6, 3}, {6, 6, 1}};
        int k = 18;
        //int res = sol2.countSubmatrices(g, k);
        //System.out.println(res);
        int[] nums = new int[]{5, 14, 3, 1, 2};
        int[] res = resultArray2(nums);
    }

    //https://leetcode.com/contest/weekly-contest-387/problems/minimum-operations-to-write-the-letter-y-on-a-grid/
    // grid = [[0,1,0,1,0],[2,1,0,1,2],[2,2,2,0,1],[2,2,2,2,2],[2,1,2,2,2]] op = 12
    // [[0,1,0,1,0],[2,1,0,1,2],[2,2,2,0,1],[2,2,2,2,2],[2,1,2,2,2]]
    public class solution {
        public static int minimumOperationsToWriteY2(int[][] grid) {
            HashMap<int[], List<String>> dict = generateIndexes(grid);
            int steps = 0;
            int prv = 0;
            for (int[] key : dict.keySet()) {
                Arrays.sort(key);

                steps = steps + key[0] + key[1];
                if (prv == key[2])
                    return 0;
                prv = key[2];
            }
            return steps;
        }

        public static HashMap<int[], List<String>> generateIndexes(int[][] grid) {
            List<String> indexes = new ArrayList<>();
            int[] count = new int[3];
            int[] root = new int[]{grid.length / 2, grid.length / 2};
            indexes.add(String.valueOf(grid.length / 2) + String.valueOf(grid.length / 2).toString());
            for (int n = 0; n < grid.length / 2; n++) {
                int[] diagL = new int[]{root[0] - 1, root[1] - 1};
                count[grid[diagL[0]][diagL[1]]]++;
                int[] diagR = new int[]{root[0] - 1, root[1] + 1};
                count[grid[diagR[0]][diagR[1]]]++;
                int[] down = new int[]{root[0] + 1, root[1]};
                count[grid[down[0]][down[1]]]++;
                indexes.add(String.valueOf(diagL[0]) + String.valueOf(diagL[1]));
                indexes.add(String.valueOf(diagR[0]) + String.valueOf(diagR[1]));
                indexes.add(String.valueOf(down[0]) + String.valueOf(down[1]));
            }
            HashMap<int[], List<String>> rs = new HashMap<>();
            int[] count2 = new int[3];
            List<String> indexes2 = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    if (!indexes.contains(String.valueOf(i) + String.valueOf(j))) {
                        count2[grid[i][j]]++;
                        indexes2.add(String.valueOf(i) + String.valueOf(j));
                    }
                }
            }
            rs.put(count, indexes);
            rs.put(count2, indexes2);
            return rs;
        }

        public int minimumOperationsToWriteY(int[][] grid) {
            int n = grid.length;
            int[] y = new int[3];
            int[] nony = new int[3];
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || j == n - i - 1) y[grid[i][j]]++;
                    else nony[grid[i][j]]++;
                }
            }
            for (int i = n / 2; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n / 2) y[grid[i][j]]++;
                    else nony[grid[i][j]]++;
                }
            }
            int res = n * n;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) continue;
                    res = Math.min(res, n * n - y[i] - nony[j]);
                }
            }
            return res;
        }
    }

    //----------*********************************************-------------------------
    //https://leetcode.com/contest/weekly-contest-387/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/
    public static class sol2 {

        public static int countSubmatrices(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                matrix[i][0] = grid[i][0];
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = matrix[i][j - 1] + grid[i][j];
                }
            }
            int res = 0;
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int i = 0; i < m; i++) {
                    sum += matrix[i][j];
                    if (sum <= k) res++;
                    else break;
                }
            }
            return res;
        }
    }

    //----------*********************************************-------------------------
    // https://leetcode.com/contest/weekly-contest-387/problems/distribute-elements-into-two-arrays-i/
    public static int[] resultArray(int[] nums) {
        ArrayDeque<Integer> stck = new ArrayDeque<Integer>();
        ArrayDeque<Integer> stck2 = new ArrayDeque<Integer>();
        stck.add(nums[0]);
        stck2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (stck.peekLast() > stck2.peekLast())
                stck.add(nums[i]);
            else
                stck2.add(nums[i]);
        }
        stck.addAll(stck2);
        int[] rs = new int[stck.size()];
        int index = 0;
        for (Integer i : stck)
            rs[index++] = i;
        return rs;
    }

    //----------*********************************************-------------------------
    //https://leetcode.com/contest/weekly-contest-387/problems/distribute-elements-into-two-arrays-ii/
    public static int[] resultArray2(int[] nums) {
        ArrayDeque<Integer> s1 = new ArrayDeque<>();
        ArrayDeque<Integer> s2 = new ArrayDeque<>();
        s1.add(nums[0]);
        s2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (greaterCount(getPrimitive(s1), nums[i]) > greaterCount(getPrimitive(s2), nums[i])) {
                s1.add(nums[i]);
            } else if (greaterCount(getPrimitive(s1), nums[i]) == greaterCount(getPrimitive(s2), nums[i])) {
                if (s1.size() <= s2.size())
                    s1.add(nums[i]);
                else
                    s2.add(nums[i]);
            } else
                s2.add(nums[i]);
        }
        s1.addAll(s2);
        return getPrimitive(s1);
    }

    public static int[] getPrimitive(ArrayDeque<Integer> st) {
        int[] res = new int[st.size()];
        int index = 0;
        for (Integer i : st)
            res[index++] = i;
        return res;
    }

    public static int greaterCount(int[] nums, int peek) {
        Arrays.sort(nums);
        int count = 0;
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = low + high / 2;
            if (nums[mid] < peek)
                low = mid;
            else if (nums[mid] > peek)
                high = mid;
            else if (nums[mid] == peek)
                return nums.length - mid;
        }
        return count;
    }
}
