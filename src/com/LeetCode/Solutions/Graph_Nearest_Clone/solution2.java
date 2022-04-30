package com.LeetCode.Solutions.Graph_Nearest_Clone;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class solution2 {

    static int findShortest(int graphNodes, int[] graphFrom, int[] graphTo, int[] ids, int val) {

        return 0;
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader());
        Scanner sc = new Scanner(new FileReader("C:\\Users\\Itachi_yv\\IdeaProjects\\LeetCode_JAVA\\src\\com\\LeetCode\\Solutions\\Graph_Nearest_Clone\\data.txt"));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] graphNodesEdges = sc.nextLine().split(" ");
        int graphNodes = Integer.parseInt(graphNodesEdges[0].trim());
        int graphEdges = Integer.parseInt(graphNodesEdges[1].trim());

        int[] graphFrom = new int[graphEdges];
        int[] graphTo = new int[graphEdges];

        for (int i = 0; i < graphEdges; i++) {
            String[] graphFromTo = sc.nextLine().split(" ");
            graphFrom[i] = Integer.parseInt(graphFromTo[0].trim());
            graphTo[i] = Integer.parseInt(graphFromTo[1].trim());
        }

        int[] ids = new int[graphNodes];

        String[] idsItems = sc.nextLine().split(" ");

        for (int i = 0; i < graphNodes; i++) {
            int idsItem = Integer.parseInt(idsItems[i]);
            ids[i] = idsItem;
        }

        int val = Integer.parseInt(sc.nextLine().split(" ")[0]);
        int ans = findShortest(graphNodes, graphFrom, graphTo, ids, val);

        System.out.println(String.valueOf(ans));
    }
}

