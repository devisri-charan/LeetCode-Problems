import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            if (nums[end] % 2 == 0){
                if (nums[start] % 2 != 0){
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    end--;
                }
                start++;
            }
            else{
                end--;
            }
        }
        return nums;
    }
}
