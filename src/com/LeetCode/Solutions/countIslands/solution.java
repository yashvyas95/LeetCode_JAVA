package com.LeetCode.Solutions.countIslands;

public class solution {
    public static int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] == '1' && visited[i][j] == false){
                    countComp(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
    public static void countComp(int i, int j, char[][] grid, boolean[][] visited){
        if(i < 0 || j < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == '0' || visited[i][j] == true){
            return;
        }
        visited[i][j] = true;
        countComp(i-1,j,grid,visited);
        countComp(i+1,j,grid,visited);
        countComp(i,j-1,grid,visited);
        countComp(i,j+1,grid,visited);
    }

    public static void main(String[] args){
        char[][] grid = {
                {'1','1','1','1','0'}
                ,{'1','1','0','1','0'}
                ,{'1','1','0','0','0'}
                ,{'0','0','0','0','0'}};
        numIslands(grid);
    }

}
