import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NAryTreePreorderTraversal {
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
        Node root = new Node(1);
        (root.children).add(new Node(2));
        (root.children).add(new Node(6));
        (root.children).add(new Node(4));
        (root.children).add(new Node(5));
        (root.children.get(0).children).add(new Node(11));
        (root.children.get(0).children).add(new Node(10));
        (root.children.get(2).children).add(new Node(7));
        (root.children.get(3).children).add(new Node(3));
        (root.children.get(3).children).add(new Node(8));
        (root.children.get(3).children).add(new Node(9));
        (root.children.get(0).children.get(0).children).add(new Node(15));
        (root.children.get(0).children.get(0).children).add(new Node(14));
        (root.children.get(3).children.get(0).children).add(new Node(13));
        (root.children.get(3).children.get(2).children).add(new Node(12));

        System.out.println(preorder(root));
    }
    public static List<Integer> preorder(Node root) {
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
}