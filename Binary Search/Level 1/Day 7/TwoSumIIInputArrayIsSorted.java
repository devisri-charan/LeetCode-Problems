import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {3,24,50,79,88,150,345};
        int target = 200;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i+1;
            int end = numbers.length - 1;
            while (start <= end){
                int mid = start + (end - start)/2;
                if (numbers[mid] + numbers[i] < target){
                    start = mid + 1;
                }
                else if (numbers[mid] + numbers[i] > target){
                    end = mid - 1;
                }
                else{
                    return new int[]{i+1,mid+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
