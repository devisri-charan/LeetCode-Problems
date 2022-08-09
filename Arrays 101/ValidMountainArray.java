public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,2,1,0};
        int[] arr1 = {0,3,2,1};
        int[] arr2 = {0,3,2,2,1};
        System.out.println(validMountainArray(arr));
        System.out.println(validMountainArray(arr1));
        System.out.println(validMountainArray(arr2));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3){
            return false;
        }
        if (arr[0] > arr[1]){
            return false;
        }

        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i+1]){
                i++;
            }
            else{
                break;
            }
        }

        for (int j = i; j < arr.length - 1; j++) {
            if (arr[j] > arr[j+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean validMountainArray1(int[] arr) {
        if (arr.length < 3){
            return false;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (isPeakIndex(i,arr)){
                return true;
            }
        }
        return false;
    }

    private static boolean isPeakIndex(int i, int[] arr) {
        for (int j = 0; j < i; j++) {
            if (arr[j] < arr[j+1]){
                continue;
            }
            else{
                return false;
            }
        }
        for (int j = i; j < arr.length - 1; j++) {
            if (arr[j] > arr[j+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
