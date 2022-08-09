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

    public static int removeDuplicates1(int[] nums) {
        
        // Check for edge cases.
        if (nums == null) {
            return 0;
        }
        
        // Use the two pointer technique to remove the duplicates in-place.
        // The first element shouldn't be touched; it's already in its correct place.
        int writePointer = 1;
        // Go through each element in the Array.
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            // If the current element we're reading is *different* to the previous
            // element...
            if (nums[readPointer] != nums[readPointer - 1]) {
                // Copy it into the next position at the front, tracked by writePointer.
                nums[writePointer] = nums[readPointer];
                // And we need to now increment writePointer, because the next element
                // should be written one space over.
                writePointer++;
            }
        }
        
        // This turns out to be the correct length value.
        return writePointer;
      }
}
