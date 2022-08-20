import java.util.ArrayList;

public class IntersectionOfTwoArraysII{
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(intersect(nums1, nums2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
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

    public static int[] intersect1(int[] nums1, int[] nums2) {
        int[] intersect = new int[nums1.length];
        return intersect;
    }
}