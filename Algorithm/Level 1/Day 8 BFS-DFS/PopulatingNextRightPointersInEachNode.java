public class PopulatingNextRightPointersInEachNode {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println();
    }

    public static Node connect(Node root) {
        if (root == null){
            return root;
        }

        Node prev = root;
        Node curr = root;

        while(prev.left != null){
            curr = prev;
            while (curr != null){
                if (curr.left!=null){
                    curr.left.next = curr.right;
                }
                if (curr.right != null && curr.next != null){
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            prev = prev.left;
        }
        return root;
    }

    public static Node connect1(Node root) {
        if (root == null){
            return root;
        }

        if (root.left!=null){
            root.left.next = root.right;
        }
        if (root.right != null && root.next != null){
            root.right.next = root.next.left;
        }

        connect1(root.left);
        connect1(root.right);
        
        return root;
    }
}
