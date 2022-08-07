
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
public class BinaryTreeLevelOrderTraversal {
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
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root == null){
            return levelOrder;
        }
        Deque<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode curr = queue.poll();
                list.add(curr.val);
                if (curr.left != null){
                    queue.offer(curr.left);
                }
                if (curr.right != null){
                    queue.offer(curr.right);
                }
            }
            levelOrder.add(list);
        }
        return levelOrder;
    }
}
