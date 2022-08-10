public class ConvertSortedArrayToBinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return insertIntoBST(nums, 0, nums.length - 1);
    }

    public static TreeNode insertIntoBST(int[] nums, int start, int end) {
        if (start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = insertIntoBST(nums,0,mid - 1);
        root.right = insertIntoBST(nums,mid + 1,end);

        return root;
    }
}
