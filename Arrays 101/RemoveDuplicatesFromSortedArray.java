import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //            0 1 2 3 4 5 6 7 8 9
        //            i i+1 i+2
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        // int count = 0;// nums.length = 10
        int start = 0;
        int end = 0;

        while (end < nums.length){
            if (nums[start] == nums[end]){
                end++;
            }
            else{
                start++;
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                System.out.println(Arrays.toString(nums));
                end++;
            }
        }
        return start + 1;
    }
}
