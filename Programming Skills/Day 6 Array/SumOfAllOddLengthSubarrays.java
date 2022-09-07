public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int endingHere = i + 1;
            int startingHere = n - i;

            int totalSubarrays = endingHere * startingHere;
            
            int oddSubarrays = totalSubarrays / 2;
            
            if (totalSubarrays % 2 == 1) {
                oddSubarrays++;
            }
            
            sum += oddSubarrays * arr[i];
        }

        return sum;
    }
}
