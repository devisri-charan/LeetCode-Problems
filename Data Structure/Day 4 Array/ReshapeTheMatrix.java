import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1;
        int c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == r && mat[0].length == c) {
            return mat;
        }
        // If the reshape operation with given parameters is possible and legal, output
        // the new reshaped matrix; Otherwise, output the original matrix.
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int[][] reshapedMatrix = new int[r][c];

        int row = 0;
        int col = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;
                if (col >= c) {
                    col = 0;
                    row++;
                }
            }
        }
        return reshapedMatrix;
    }
}