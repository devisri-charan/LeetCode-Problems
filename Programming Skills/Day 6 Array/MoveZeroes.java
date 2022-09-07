import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1,0,1};
        moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int start = 0;
        int end = 1;

        while (end < nums.length){
            if (nums[end] != 0){
                if (nums[start] == 0){
                    int temp = nums[end];
                    nums[end] = nums[start];
                    nums[start] = temp;
                }
                start++;
            }
            else{
                if (nums[start] != 0){
                    start++;
                }
            }
            end++;
        }
    }
    public static void moveZeroes1(int[] nums) {
        int start = 0;
        int end = 0;

        while (end < nums.length){
            if (nums[end] != 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
            }
            end++;
        }
    }
}
