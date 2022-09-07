public class MatrixDiagonalSum {
    public static void main(String[] args) {
        
    }

    public static int diagonalSum(int[][] mat) {
        int diagonalSum = 0;
        int n = mat.length;

        for (int i = 0; i < mat.length; i++) {
            diagonalSum += mat[i][i];
            diagonalSum += mat[n - i - 1][i];
        }

        if (n%2 == 0){
            return diagonalSum;
        }
        else{
            return diagonalSum - mat[n/2][n/2];
        }
    }
}
