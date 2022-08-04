public class FibonacciNumber{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

    public static int fib(int n){
        // Recurisve Solution
        if (n==0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static int fib1(int n){
        // Iterative Solution
        if (n <=1){
            return n;
        }

        int a = 0;
        int b = 1;

        while (n > 1){
            int sum = a+b;
            a = b;
            b = sum;
            n--;
        }
        return b;
    }
    public static int fib2(int n){
        // DP Solution
        if (n==0){
            return 0;
        }
        
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}