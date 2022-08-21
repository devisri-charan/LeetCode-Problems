import java.util.LinkedList;
import java.util.Queue;

public class O1Matrix {
    public static void main(String[] args) {
        
    }


    public static int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }
                else {
                    mat[i][j] = -1;
                }
            }
        }

        int distance = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!queue.isEmpty()){
            int size = queue.size();
            distance++;
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] direction : directions) {
                    int x = point[0] + direction[0];
                    int y = point[1] + direction[1];
    
                    if(x < 0 || y < 0 || x >= rows || y >= cols || mat[x][y] != -1){
                        continue;
                    }
    
                    queue.add(new int[]{x,y});
                    
                    mat[x][y] = distance;
                }
            }
            
        }
        return mat;
    }
}
