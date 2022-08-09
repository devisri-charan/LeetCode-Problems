import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int greatestElementOnRightSide = arr[n-1];
        arr[n - 1] = -1;

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > greatestElementOnRightSide){
                int temp = arr[i];
                arr[i] = greatestElementOnRightSide;
                greatestElementOnRightSide = temp;
            }
            else{
                arr[i] = greatestElementOnRightSide;
            }
        }
        return arr;
    }

    public static int[] replaceElements1(int[] arr) {
        int n = arr.length;
        if (n == 1){
            return new int[]{-1};
        }
        for (int i = 0; i < n - 1; i++) {
            int greatestElementOnRightSide = arr[i+1];
            for (int j = i+1; j < n; j++) {
                if (arr[j] > greatestElementOnRightSide){
                    greatestElementOnRightSide = arr[j];
                }
            }
            arr[i] = greatestElementOnRightSide;
        }
        arr[n - 1] = -1;
        return arr;
    }
}
