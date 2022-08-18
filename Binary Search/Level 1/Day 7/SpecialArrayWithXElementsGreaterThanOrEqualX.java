import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(specialArray1(nums));
    }

    public static int specialArray(int[] nums) {
        for (int x = 0; x <= nums.length; x++) {
            int count = 0;
            for (int num : nums) {
                if (num >= x){
                    count++;
                }
            }
            if (count == x){
                return x;
            }
        }
        return -1;
    }

    public static int specialArray1(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] >= nums.length - mid){
                if (mid == 0 || nums[mid - 1] < nums.length - mid){
                    return nums.length - mid;
                }
                else{
                    end = mid - 1;
                }
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
