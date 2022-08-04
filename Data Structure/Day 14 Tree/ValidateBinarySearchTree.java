import java.util.ArrayList;

public class ValidateBinarySearchTree{
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
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(list, root);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void inOrder(ArrayList<Integer> list, TreeNode root){
        if (root == null){
            return;
        }
        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
    }
}