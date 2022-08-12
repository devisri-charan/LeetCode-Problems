public class RemoveNthNodeFromEndOfList{
    
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
        // head.next.next = newNode(3);
        // head.next.next.next = newNode(4);
        // head.next.next.next.next = newNode(5);

        System.out.print("\nList: ");
        printList(head);
        printList(removeNthFromEnd(head, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode end = head;
        while (n > 0){
            end = end.next;
            n--;
        }

        if (end == null){
            return head.next;
        }

        while (end.next != null){
            end = end.next;
            start = start.next;
        }

        start.next = start.next.next;

        return head;
    }
}