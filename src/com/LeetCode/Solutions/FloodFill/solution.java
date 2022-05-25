package com.LeetCode.Solutions.FloodFill;
import java.util.*;

public class solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][];
        for(int i = 0 ; i < image.length ; i++)
            visited[i] = new boolean[image[0].length];
        int[][] directions = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};
        ArrayDeque<int[]> position = new ArrayDeque<>();
        position.add(new int[]{sr,sc});
        int rootColor = image[sr][sc];
        int nr = sr;
        int nc = sc;
        while(position.size()!=0){
            int[] poll = position.poll();
            nr = poll[0];nc = poll[1];
            visited[nr][nc] = true;
            image[nr][nc] = newColor;
            for(int[] direction : directions){
                int tempnr = nr+direction[0];
                int tempnc = nc+direction[1];
                if(tempnr>=0 && tempnr<image.length && tempnc >=0 && tempnc<image[0].length) {
                    if (image[tempnr][tempnc] == rootColor && visited[tempnr][tempnc]==false) {
                        if (!position.contains(new int[]{tempnr, tempnc}))
                            position.add(new int[]{tempnr, tempnc});
                    }
                }
            }
        }
        return image;
    }

    public static void main(String[] args){
            int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
            int sc = 1;int sr = 1;
            int newColor = 2;
            floodFill(image,sr,sc,newColor);
    }
}
