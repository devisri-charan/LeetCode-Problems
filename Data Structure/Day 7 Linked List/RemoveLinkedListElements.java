public class RemoveLinkedListElements {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode newNode(int val){
        ListNode temp = new ListNode();
        temp.val = val;
        temp.next = null;
        return temp;
    }

    static void printList(ListNode Node){
        while (Node != null) {
            System.out.print(Node.val+ " -> ");
            Node = Node.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = newNode(1);
        head.next = newNode(2);
        // head.next.next = newNode(7);
        // head.next.next.next = newNode(7);
        // head.next.next.next.next = newNode(4);
        // head.next.next.next.next.next = newNode(5);
        // head.next.next.next.next.next.next = newNode(6);

        printList(head);
        printList(removeElements(head, 1));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode ptr = head;
        while (ptr != null && ptr.next!=null){
            if (ptr.next.val == val){
                ptr.next = ptr.next.next;
            }
            else{
                ptr = ptr.next;
            }
        }

        if (head != null && head.val == val){
            return head.next;
        }

        return head;
    }
}
