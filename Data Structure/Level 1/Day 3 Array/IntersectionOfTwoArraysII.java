import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII{
    public static void main(String[] args) {
        int[] nums1 = {2,1};
        int[] nums2 = {1,2};
        System.out.println(Arrays.toString(intersect1(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> commonElements = new ArrayList<>();
        int start1 = 0;
        int start2 = 0;

        while (start1 < nums1.length && start2 < nums2.length){
            if (nums1[start1] == nums2[start2]){
                if (!commonElements.contains(nums1[start1])){
                    commonElements.add(nums1[start1]);
                }
                start1++;
                start2++;
            }
            else if (nums1[start1] < nums2[start2]){
                start1++;
            }
            else{
                start2++;
            }
        }
        int[] intersect = new int[commonElements.size()];

        for (int i = 0; i < commonElements.size(); i++) {// 0 1
            intersect[i] = commonElements.get(i);
        }
        return intersect;
    }
    public static int[] intersect1(int[] nums1, int[] nums2){
        ArrayList<Integer> commonElements = new ArrayList<>();
        int[] count = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            count[nums1[i]]++;
        }

        for (int i = 0; i < nums2.length; i++) {
            if (count[nums2[i]] > 0){
                commonElements.add(nums2[i]);
                count[nums2[i]]--;
            }
        }

        int[] intersect = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {// 0 1
            intersect[i] = commonElements.get(i);
        }
        return intersect;
    }
}