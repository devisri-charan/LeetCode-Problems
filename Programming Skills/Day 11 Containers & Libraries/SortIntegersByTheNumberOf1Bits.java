import java.util.Arrays;

public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += hammingWeight(arr[i])*10001;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        }
        return arr;
    }

    public static int hammingWeight(int n) {
        int ones = 0;
        while (n!=0){
            ones += (n & 1);
            n = n >>> 1;
        }
        return ones;
    }
}
