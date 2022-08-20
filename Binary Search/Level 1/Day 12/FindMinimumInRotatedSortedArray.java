public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMin1(nums));
    }

    public static int findMin(int[] nums) {
        if (findPivot(nums) == -1){
            return nums[0];
        }
        return nums[findPivot(nums) + 1];
    }

    public static int findMin1(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (nums[mid] < nums[end]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return nums[start];
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        } 
        return -1;
    }
}
