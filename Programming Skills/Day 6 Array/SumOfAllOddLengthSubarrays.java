public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays1(arr));
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

    public static int sumOddLengthSubarrays1(int[] arr) {
        int sum = 0;
        int n = arr.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {            
            prefixSum[i] += prefixSum[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 == 1) {
                    sum += prefixSum[j + 1] - prefixSum[i];
                }
            }
        }

        return sum;
    }
}
