import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        
    }

    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> rottenOranges = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2){
                    rottenOranges.offer(new int[]{i,j});
                }
                else if (grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if (fresh == 0){
            return 0;
        }

        int time = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while (fresh > 0 && !rottenOranges.isEmpty()){
            time++;
            int size = rottenOranges.size();
            for (int i = 0; i < size; i++) {
                int[] point = rottenOranges.poll();
                for (int[] direction : directions) {
                    int x = point[0] + direction[0];
                    int y = point[1] + direction[1];
                    
                    if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2){
                        continue;
                    }
                    
                    grid[x][y] = 2;
                    
                    rottenOranges.offer(new int[]{x,y});
                    fresh--;
                }
            }
        }
        
        if (fresh == 0){
            return time;
        }
        else{
            return -1;
        }
    }
}
