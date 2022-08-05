import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class BinaryTreeInorderTraversal {
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
        System.out.println(inorderTraversal(root));
    }
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> nStack = new Stack<>();
        if (root == null){
            return inOrder;
        }

        while (root != null || !nStack.isEmpty()){
            while(root != null){
                nStack.push(root);
                root = root.left;
            }
            root = nStack.pop();
            inOrder.add(root.val);
            root = root.right;
        }
        return inOrder;
    }
}
