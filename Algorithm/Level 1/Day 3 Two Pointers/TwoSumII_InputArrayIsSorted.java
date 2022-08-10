import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted{
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];

        while (start < end){
            if (numbers[start] + numbers[end] < target){
                start++;
            }
            else if (numbers[start] + numbers[end] > target){
                end--;
            }
            else{
                result[0] = start + 1;
                result[1] = end + 1;
                start++;
                end--;
            }
        }
        return result;
    }
}