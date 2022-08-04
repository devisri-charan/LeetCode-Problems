import java.util.Arrays;

public class DuplicateZeros{
    public static void main(String[] args) {
        int[] arr = {0,4,1,0,0,8,0,0,3};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == 0){
                for (int j = arr.length - 2; j >= i; j--) {
                    arr[j+1] = arr[j];
                }
                i += 2;
            }
            else{
                i++;
            }
        }
    }
}