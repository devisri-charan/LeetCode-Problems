import java.util.ArrayList;
import java.util.Arrays;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        ArrayList<Integer> nums2List = new ArrayList<>();
        for (int num2 : nums2) {
            nums2List.add(num2);
        }

        for (int i = 0; i<nums1.length;i++) {
            int nextGreaterElement = -1, j = nums2.length - 1;
            while(j >= 0 && nums2[j] != nums1[i]) {
                if(nums2[j] > nums1[i]){
                    nextGreaterElement = nums2[j];
                }
                j--;
            }
            ans[i] = nextGreaterElement;
        }
        return ans;
    }
}
