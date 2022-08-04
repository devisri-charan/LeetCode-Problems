import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrder(root));
    }
    
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null){
            return levelOrder;
        }

        queue.add(root);

        while (!queue.isEmpty()){
            List<Integer> level = new LinkedList<>();
            int levelHeight = queue.size();

            for (int i = 0; i < levelHeight; i++) {
                if (queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                level.add(queue.poll().val);
            }
            levelOrder.add(level);
        }
        return levelOrder;
    }
    public static List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        levelTraversal(levelOrder,root,0);
        return levelOrder;
    }

    public static void levelTraversal(List<List<Integer>> levelOrder, TreeNode root, int level) {
        if (root == null){
            return;
        }
        if (level >= levelOrder.size()){
            levelOrder.add(new LinkedList<Integer>());
        }
        levelOrder.get(level).add(root.val);
        levelTraversal(levelOrder, root.left, level + 1);
        levelTraversal(levelOrder, root.right, level + 1);
    }

    public static List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null){
            return levelOrder;
        }

        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> currLevel = new LinkedList<>();
            int levelHeight = queue.size();

            for (int i = 0; i < levelHeight; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null){
                    queue.add(curr.left);
                }
                if (curr.right != null){
                    queue.add(curr.right);
                }
                currLevel.add(curr.val);
            }
            levelOrder.add(currLevel);
        }
        return levelOrder;
    }
}
