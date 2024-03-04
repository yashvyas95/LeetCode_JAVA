package BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

// link : https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

public class RatInaMaze {
    public static void main(String[] args) {
        int[][] m = new int[][]{{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        int n = 4;
        ArrayList<String> rs = findPath(m, n);
        rs.forEach(System.out::println);
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        recurse(m, new int[]{0, 0}, new StringBuilder());
        return rs;
    }

    static ArrayList<String> rs = new ArrayList<>();
    static final int[][] direct = new int[][]{{1, 0, 0}, {-1, 0, 1}, {0, 1, 2}, {0, -1, 3}};

    public static void recurse(int[][] m, int[] pos, StringBuilder sb) {
        // reached
        if ((pos[0] == pos[1]) && pos[1] == m.length - 1 && m[pos[0]][pos[1]] == 1) {
            rs.add(sb.toString());
            return;
        }
        if (m[pos[0]][pos[1]] == 1) {
            m[pos[0]][pos[1]] = 0;
            for (int[] d : direct) {
                if (d[0] + pos[0] < m.length && d[1] + pos[1] < m.length && d[0] + pos[0] >= 0 && d[1] + pos[1] >= 0) {
                    String directionToBeTaken = "";
                    if (d[2] == 0) directionToBeTaken = "D";
                    else if (d[2] == 1) directionToBeTaken = "U";
                    else if (d[2] == 2) directionToBeTaken = "R";
                    else if (d[2] == 3) directionToBeTaken = "L";
                    recurse(m, new int[]{pos[0] + d[0], pos[1] + d[1]}, new StringBuilder(sb).append(directionToBeTaken));
                }
            }
            m[pos[0]][pos[1]] = 1;
        }
    }
}

