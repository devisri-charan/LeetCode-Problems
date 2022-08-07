public class MinCostClimbingStairs{
    public static void main(String[] args) {
        int[] cost = {1,100};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;//2
        int[] dp = new int[n+2];//0 1 2
        dp[n] = 0;

        for (int i = n-1; i >= 0; i--) {//i = 1; dp[2]+dp[3];
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }

        int minCost = Math.min(dp[0], dp[1]);
        return minCost;
    }
}