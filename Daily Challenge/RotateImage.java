import java.util.Arrays;

public class RotateImage{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        int n = matrix.length;

        for (int i = 0; i < n/2; i++) {
            int[] tempRow = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = tempRow;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}