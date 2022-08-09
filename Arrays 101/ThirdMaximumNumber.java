public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,3,5};
        System.out.println(thirdMax1(nums));
    }

    public static int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        
        boolean noThirdMax = true;
        
        for (int i = 0; i < nums.length; i++) {
            if (firstMax < nums[i]){
                firstMax = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != firstMax && secondMax < nums[i]){
                secondMax = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != firstMax && nums[i] != secondMax && thirdMax <= nums[i]){
                thirdMax = nums[i];
                noThirdMax = false;
            }
        }
        
        if (noThirdMax){
            return firstMax;
        }
        return thirdMax;
    }
    
    public static int thirdMax1(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (firstMax < nums[i]){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }
            else if (nums[i] < firstMax && secondMax < nums[i]){
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if (nums[i] < secondMax && thirdMax < nums[i]){
                thirdMax = nums[i];
            }
        }
        
        if (thirdMax == Long.MIN_VALUE){
            return (int)firstMax;
        }
        return (int)thirdMax;
    }
}
