public class pivotIndex {
    public static void main(String[] args) {
        int[] nums = {4,0};
        System.out.println(pivotIdx(nums));
    }

    public static int pivotIdx(int[] nums) {
        int n = nums.length;
        if (n==1){
            return 0;
        }

        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i]; 
        }

        if (prefixSum[n-1] - prefixSum[0] == 0){
            return 0;
        }
        
        for (int i = 1; i < n; i++) {
            if (prefixSum[n-1] - prefixSum[i] == prefixSum[i-1]){
                return i;
            }
        }
        return -1;
    }
}
