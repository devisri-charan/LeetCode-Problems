import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class BinaryTreePreorderTraversal {
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
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        System.out.println(preorderTraversal(root));
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        Stack<TreeNode> nStack = new Stack<>();
        if (root == null){
            return preOrder;
        }
        nStack.push(root);

        while (!nStack.isEmpty()){
            TreeNode curr = nStack.pop();
            if (curr!=null){
                preOrder.add(curr.val);
            }

            if (curr.right != null){
                nStack.push(curr.right);
            }
            if (curr.left != null){
                nStack.push(curr.left);
            }
        }
        return preOrder;
    }
}
