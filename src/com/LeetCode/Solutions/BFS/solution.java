package com.LeetCode.Solutions.BFS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class solution {

    //n = number of nodes
    //m = number of edges
    //edges = edges between nodes
    //s = starting node
    public static List<Integer> bfs(int n, int m, List<String> edges, int s) {
        // Write your code here
        long[] cost = new long[n];
        HashMap<Integer, List<Integer>> container = new HashMap<>();
        for (int i = 0; i < n; i++) {
            var temp = new ArrayList<Integer>();
            container.put(i, temp);
        }
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("C:\\Users\\Itachi_yv\\IdeaProjects\\LeetCode_JAVA\\src\\com\\LeetCode\\Solutions\\BFS\\data.txt"));
        int num_test_case = sc.nextInt();//Integer.parseInt(sc.nextLine().toString().trim());
        for (int i = 0; i < num_test_case; i++) {
            String[] temp = sc.nextLine().split(" ");
            boolean cond = true;
            while (cond) {
                if (temp.length == 0 || temp[0].equals("")) {
                    temp = sc.nextLine().split(" ");
                } else {
                    cond = false;
                }
            }
            int[] data = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
            int numofNodes = data[0];
            int numofEdges = data[1];
            List<String> roads = new ArrayList<>();
            for (long i1 = 0; i1 < numofEdges; i1++) {
                String[] temp2 = sc.nextLine().split(" ");
                roads.add(temp2[0] + "," + temp2[1]);
            }
            int startingNode = sc.nextInt();
            System.out.println(bfs(numofNodes, numofEdges, roads, startingNode));
        }

    }
}
