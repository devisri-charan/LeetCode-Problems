import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            if (nums[start] == val){
                nums[start] = nums[end];
                System.out.println(Arrays.toString(nums));
                end--;
            }
            else{
                start++;
            }
        }
        return end + 1;
    }
}
