import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[m-1][n-1];
    }
}
