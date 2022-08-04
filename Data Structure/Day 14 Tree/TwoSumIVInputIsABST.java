import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSumIVInputIsABST {
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
        System.out.println(findTarget(root,9));
    }

    public static boolean findTarget(TreeNode root, int k) {
        if (root.left == null && root.right == null){
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        DFS_Traversal(root, list);
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer integer : list) {
            if (hashSet.contains(k - root.val)){
                return true;
            }
            else{
                hashSet.add(integer);
            }
        }
        return false;
    }

    public static void DFS_Traversal(TreeNode root, ArrayList<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.val);
        DFS_Traversal(root.left, list);
        DFS_Traversal(root.right, list);
    }
}
