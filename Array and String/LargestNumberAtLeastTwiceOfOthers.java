public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int largestInteger = nums[0];
        int dominantIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (largestInteger < nums[i]){
                largestInteger = nums[i];
                dominantIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == dominantIndex){
                continue;
            }
            else if (largestInteger >= 2*nums[i]){
                continue;
            }
            else{
                return -1;
            }
        }
        return dominantIndex;
    }
}
