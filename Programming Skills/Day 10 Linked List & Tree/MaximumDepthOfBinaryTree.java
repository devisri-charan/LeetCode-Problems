import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null){
            return 0;
        }
        queue.add(root);

        while (!queue.isEmpty()){
            int levelHeight = queue.size();

            for (int i = 0; i < levelHeight; i++) {
                if (queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                queue.poll();
            }
            depth += 1;
        }
        return depth;
    }

    public static int maxDepth1(TreeNode root) {
        if (root == null){
            return 0;
        }

        int leftDepth = maxDepth1(root.left);
        int rightDepth = maxDepth1(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
