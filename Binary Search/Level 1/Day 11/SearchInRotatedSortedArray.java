public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static int search1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == nums[mid]){
                return mid;
            }

            if (nums[start] <= nums[mid]){  // range b/w start and mid is sorted
                if (nums[start] <= target && target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {  // range b/w mid and end is sorted
                if (nums[mid] < target && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);

        if (pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        else if (target == nums[pivot]){
            return pivot;
        }

        else if (target > nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

        else{
            return binarySearch(nums, target, pivot+1, nums.length - 1);
        }
    }

    // this will not work in duplicate values
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        } 
        return -1;
    }

    public static int findPivotwithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        } 
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
