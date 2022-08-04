import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares1(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

    public static int[] sortedSquares1(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] squaredArray = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int left = Math.abs(nums[start]);
            int right = Math.abs(nums[end]);

            if (left < right){
                squaredArray[i] = right*right;
                end--;
            }
            else{
                squaredArray[i] = left*left;
                start++;
            }
        }

        return squaredArray;
    }
}
