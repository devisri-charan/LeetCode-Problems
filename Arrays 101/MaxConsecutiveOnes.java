// Given a binary array nums, return the maximum number of consecutive 1's in the array.
import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
        scanner.close();
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxOnes = 0;
        int start = 0;
        int tempMaxOnes = 0;

        while (start < arr.length) {
            int c = arr[start];
            if (c == 1) {
                tempMaxOnes += 1;
            } else if (c == 0) {
                tempMaxOnes = 0;
            }
            maxOnes = Math.max(maxOnes, tempMaxOnes);
            start++;
        }
        return maxOnes;
    }
}
