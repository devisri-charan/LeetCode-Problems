import java.util.Stack;

class TreeNode {
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
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }

        Stack<TreeNode> nStack = new Stack<>();
        TreeNode prev = null;
        while (root != null || !nStack.isEmpty()) {
            while (root != null) {
                nStack.push(root);
                root = root.left;
            }
            root = nStack.pop();

            if(prev != null && root.val <= prev.val){
                return false;
            }
            
            prev = root;
            root = root.right;
        }
        return true;
    }
}