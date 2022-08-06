import java.util.Arrays;

public class NumberOfIslands_ {
    public static void main(String[] args) {
        char[][] grid = {
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
                        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int noOfIslands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    changeLandToWater(grid,i,j,m,n);
                    noOfIslands++;
                }
            }
        }
        return noOfIslands;
    }

    public static void changeLandToWater(char[][] grid, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        changeLandToWater(grid, i+1, j,m,n);
        changeLandToWater(grid, i-1, j,m,n);
        changeLandToWater(grid, i, j+1,m,n);
        changeLandToWater(grid, i, j-1,m,n);
    }
}
