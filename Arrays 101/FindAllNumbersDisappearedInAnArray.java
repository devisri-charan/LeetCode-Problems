import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums1 = {1,1};
        System.out.println(findDisappearedNumbers1(nums));
        System.out.println(findDisappearedNumbers1(nums1));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int n = nums.length;
        for (int num : nums) {
            hashSet.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (!hashSet.contains(i)){
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers;
    }
    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        int[] temp = nums.clone();

        for (int i = 0; i < temp.length; i++) {
            temp[nums[i] - 1] = 0;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (temp[i - 1] != 0){
                disappearedNumbers.add(i);
            }
        }
        
        return disappearedNumbers;
    }
}
