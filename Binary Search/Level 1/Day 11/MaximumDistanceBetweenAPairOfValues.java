public class MaximumDistanceBetweenAPairOfValues{
    public static void main(String[] args) {
        int[] nums1 = {55,30,5,4,2};
        int[] nums2 = {100,20,10,10,5};
        System.out.println(maxDistance(nums1, nums2));
    }

    public static int maxDistance(int[] nums1, int[] nums2) {
        int maxDistance = 0;
        for (int i = 0; i < nums1.length; i++) {
            int start = i;
            int end = nums2.length - 1;
            int mid = i;
            while (start <= end){
                mid = start + (end - start)/2;
                if (nums1[i] <= nums2[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            if (end >= 0){
                maxDistance = Math.max(maxDistance, end - i);
            }
        }
        return maxDistance;
    }
}