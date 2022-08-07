public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs1(n));
    }

    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        }

        if (n==2){
            return 2;
        }

        else{
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
    public static int climbStairs1(int n) {
        if (n==1){
            return 1;
        }
        
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3 ; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
