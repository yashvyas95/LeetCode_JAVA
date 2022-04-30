package com.LeetCode.Solutions.Graph_Rodes;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    static class Node {
        ArrayList<Node> roads;
        ArrayList<Long> costs;
        int id;

        public Node(int id) {
            roads = new ArrayList<>();
            costs = new ArrayList<>();
            this.id = id;
        }

        public List<Integer> fetchRoadIds() {
            List<Integer> ids_list = new ArrayList<>();
            for (var x : roads) {
                ids_list.add(x.id);
            }
            return ids_list;
        }
    }
    /*
     * Complete the 'roadsAndLibraries' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c_lib
     *  3. INTEGER c_road
     *  4. 2D_INTEGER_ARRAY cities
     */

    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<String> roads) {
        // Write your code here
        List<Node> cities = new ArrayList<>();
        List<Long> costs = new ArrayList<>();
        List<Boolean> connection_Library = new ArrayList<>();
        int[] connection_lib = new int[n];
        int[] lib = new int[n];
        int lib_count = 0;
        int road_count = 0;
        if (c_lib <= c_road) {
            return n * c_lib;
        } else {
            for (int i = 0; i < n; i++) {
                Node city = new Node(i);
                cities.add(i, city);
                connection_Library.add(i, false);
            }
            for (var road : roads) {
                var split_indexes = road.split(",");
                Node city_inner = cities.get(Integer.parseInt(split_indexes[0]) - 1);
                city_inner.roads.add(cities.get(Integer.parseInt(split_indexes[1]) - 1));
                city_inner.costs.add(new Long(c_lib));
            }
            cities.sort(new compareCityRodes());


            for (int i = 0; i < cities.size(); i++) {
                var city_element = cities.get(i);
                if (connection_Library.get(i) != true) {

                }
            }
        }
        if (connection_Library.stream().filter(c -> c == false).count() > 1) {
            return -1;
        }
        return (lib_count * c_lib) + (road_count * c_road);
    }

    public static boolean checkConnectionHasLib(Node city) {
        return false;
    }

    public static class compareCityRodes implements Comparator<Node> {

        @Override
        public int compare(Node firstPlayer, Node secondPlayer) {
            return Integer.compare(firstPlayer.roads.size(), secondPlayer.roads.size());
        }
    }
}

public class solution2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("C:\\Users\\Itachi_yv\\IdeaProjects\\LeetCode_JAVA\\src\\com\\LeetCode\\Solutions\\Graph_Rodes\\data.txt"));

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
            int numOfCities = data[0];
            int numOfRoads = data[1];
            int c_lib = data[2];
            int c_road = data[3];
            List<String> roads = new ArrayList<>();
            for (long i1 = 0; i1 < numOfRoads; i1++) {
                String[] temp2 = sc.nextLine().split(" ");
                roads.add(temp2[0] + "," + temp2[1]);
            }
            System.out.println(Result.roadsAndLibraries(numOfCities, c_lib, c_road, roads));
        }


    }
}
