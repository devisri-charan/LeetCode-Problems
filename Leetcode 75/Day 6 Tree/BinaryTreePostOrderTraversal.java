import java.util.ArrayList;
import java.util.List;
// import java.util.Stack;
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
public class BinaryTreePostOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(postorderTraversal(root));
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        if (root == null){
            return postOrder;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);
        while (!stack1.empty()){
            TreeNode curr = stack1.pop();
            if (curr != null){
                stack2.push(curr);
            }

            if (curr.left != null){
                stack1.push(curr.left);
            }

            if (curr.right != null){
                stack1.push(curr.right);
            }
        }

        while (!stack2.isEmpty()){
            postOrder.add(stack2.pop().val);
        }
        return postOrder;
    }
}

