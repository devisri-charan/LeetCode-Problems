import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7}; // temp = [5 6 7] 
                    //0 1 2 3 4 5 6
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    public static int[] rotate(int[] nums, int k){
        int step = k % nums.length; // 3 % 7 = 3
        int[] temp = new int[step];
        for (int i = 0; i < step; i++) {
            temp[i] = nums[nums.length - step + i];
        }
        
        for (int i = nums.length - step - 1; i >= 0; i--) {
            nums[i + step] = nums[i];
        }

        for (int i = 0; i < step; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }
    
    public static int[] rotate1(int[] nums, int k){
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        return nums;
    }

    public static void reverse(int[] nums,int start,int end){
        while (start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
