import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist1(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkIfExist1(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (Arrays.binarySearch(arr, 2*arr[i]) >= 0 && Arrays.binarySearch(arr, 2*arr[i]) != i) {
                return true;
            }
        }
        return false;
    }
}
