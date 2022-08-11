import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays{
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            int d1 = arr1[i] - d;
            int d2 = arr1[i] + d;
            if (!InRange(arr2, d1, d2)){
                count++;
            }
        }
        return count;
    }

    public static boolean InRange(int[] arr2,int d1,int d2){
        int start = 0;
        int end = arr2.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (d1 <= arr2[mid] && arr2[mid] <= d2){
                return true;
            }
            else if (d1 > arr2[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}