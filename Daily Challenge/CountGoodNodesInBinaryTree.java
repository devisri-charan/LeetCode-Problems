public class CountGoodNodesInBinaryTree {
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

    }
    
    static int count = 0;

    public static int goodNodes(TreeNode root) {
        if (root==null){
            return count;
        }
        dfs(root, root.val);
        return count;
    }

    public static void dfs(TreeNode root, int val) {
        if (root==null){
            return;
        }
        
        if (root.val >= val){
            count++;
        }

        dfs(root.left, Math.max(val, root.val));
        dfs(root.right, Math.max(val, root.val));
    }
}
