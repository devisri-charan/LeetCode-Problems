import java.util.Arrays;

public class GreatestSumDivisibleByThree{
    public static void main(String[] args) {
        int[] nums = {3,6,5,1,8};
        System.out.println(maxSumDivThree(nums));
    }

    public static int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        //dp[i] = max sum such that the remainder == i when sum / 3 
        for (int num : nums) {
            for (int i : Arrays.copyOf(dp, dp.length)) {
                //updating each remainder for current "num"
                dp[(num + i) % 3] = Math.max(dp[(num + i) % 3], num + i);
            }
        }
        return dp[0];
    }
}