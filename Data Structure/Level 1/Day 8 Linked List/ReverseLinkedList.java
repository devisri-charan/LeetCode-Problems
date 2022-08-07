public class ReverseLinkedList{
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
        // ListNode head = newNode(1);
        ListNode head = null;
        // head.next = newNode(2);
        // head.next.next = newNode(7);
        // head.next.next.next = newNode(7);
        // head.next.next.next.next = newNode(4);
        // head.next.next.next.next.next = newNode(5);
        // head.next.next.next.next.next.next = newNode(6);

        printList(head);
        printList(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }

    public static ListNode reverseList1(ListNode head) {
        if (head == null){
            return null;
        }

        if (head.next == null){
            return head;
        }

        ListNode rest = reverseList1(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }
}