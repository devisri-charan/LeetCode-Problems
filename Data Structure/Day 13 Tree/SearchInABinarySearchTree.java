public class SearchInABinarySearchTree{
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        int val = 5;
        System.out.println(searchBST(root, val));
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null){
            return root;
        }

        if (root.val == val){
            return root;
        }

        if (root.val < val){
            return searchBST(root.right, val);
        }
        else {
            return searchBST(root.left, val);
        }
    }
}