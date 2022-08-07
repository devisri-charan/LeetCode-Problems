public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE; //IMPORTANT when ums[i] < 0 and nums.length = 1;
        int max_ending_here = 0;    // Example: nums = {-2}; answer = -2;

        for (int i = 0; i < nums.length; i++) {
            max_ending_here += nums[i];
            if (max_ending_here > max_so_far){
                max_so_far = max_ending_here;
            }

            if (max_ending_here < 0){
                max_ending_here = 0;
            }
        }

        return max_so_far;
    }
}
