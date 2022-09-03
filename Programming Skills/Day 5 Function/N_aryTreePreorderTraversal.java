import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N_aryTreePreorderTraversal {
    static class Node {
        public int val;
        public List<Node> children;
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public static void main(String[] args) {
        
    }

    public List<Integer> preorder1(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        Stack<Node> nStack = new Stack<>();
        nStack.push(root);

        while (!nStack.isEmpty()){
            Node curr = nStack.pop();
            if (curr != null){
                preOrder.add(curr.val);
                for (int i = curr.children.size() - 1; i >=0 ;i--) {
                    nStack.add(curr.children.get(i));
                }
            }
        }
        return preOrder;
    }

    List<Integer> preOrder = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null){
            return null;
        }
        preOrder.add(root.val);

        if (root.children != null){
            for (Node child : root.children) {
                preorder(child);
            }
        }
        return preOrder;
    }
}
