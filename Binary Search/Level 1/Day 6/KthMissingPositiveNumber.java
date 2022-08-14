public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] - (mid + 1) < k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start + k;
    }

    public static int findKthPositive1(int[] arr, int k) {
        int[] count = new int[1001];
        int miss = 0;
        int kthMissingPositiveNumber = arr[0] + k;

        for (int i : arr) {
            count[i]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] != 1 && miss == k - 1) {
                kthMissingPositiveNumber = i;
                break;
            } 
            else {
                miss++;
            }
        }
        return kthMissingPositiveNumber;
    }
}
