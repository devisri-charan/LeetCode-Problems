import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange1(nums, 1)));
    }

    public static int[] searchRange(int[] nums, int target){
        int[] positions = {-1,-1};
        positions[0] = search(nums, target, true);
        
        if (positions[0] != -1){
            positions[1] = search(nums, target, false);
        }

        return positions;
    }

    public static int search(int[] nums, int target, boolean findFirstPosition){
        int position = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] == target){
                position = mid;
                if (findFirstPosition){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        
        return position;
    }

    public static int[] searchRange1(int[] nums, int target) {
        int[] positions = {-1,-1};

        if (nums.length == 0){
            return positions;
        }
        
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] == target){
                if (mid == 0 || nums[mid - 1] != target){
                    positions[0] = mid;
                    break;
                }
                else{
                    end = mid - 1;
                }
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        if (positions[0] == -1){
            return positions;
        }

        int start1 = 0;
        int end1 = nums.length - 1;
        
        while (start1 <= end1){
            int mid = start1 + (end1 - start1)/2;
            if (nums[mid] == target){
                if (mid == nums.length - 1 || nums[mid + 1] != target){
                    positions[1] = mid;
                    break;
                }
                else{
                    start1 = mid + 1;
                }
            }
            else if (nums[mid] > target){
                end1 = mid - 1;
            }
            else { 
                start1 = mid + 1;
            }
        }

        return positions;
    }

    public static int[] searchRange2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] positions = {-1,-1};
        
        while (start <= nums.length - 1){
            if (nums[start] == target){
                positions[0] = start;
                break;
            }

            else{
                start++;
            }
        }

        while (end >= 0){
            if (nums[end] == target){
                positions[1] = end;
                break;
            }

            else{
                end--;
            }
        }

        return positions;
    }
}
