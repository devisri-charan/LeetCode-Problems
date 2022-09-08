import java.util.HashSet;

public class ContainsDuplicate{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashset.contains(nums[i])){
                return true;
            }
            hashset.add(nums[i]);
        }
        return false;
    }
}