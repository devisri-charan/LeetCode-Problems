public class RemoveDuplicatesFromSortedList {
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
        // ListNode head = null;
        head.next = newNode(1);
        head.next.next = newNode(2);
        head.next.next.next = newNode(2);
        head.next.next.next.next = newNode(3);
        head.next.next.next.next.next = newNode(3);
        head.next.next.next.next.next.next = newNode(3);

        printList(head);
        printList(deleteDuplicates(head));
    }
    
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head;
        if (ptr == null){
            return null;
        }

        while (ptr.next != null){
            if (ptr.next.val == ptr.val){
                ptr.next = ptr.next.next;
            }
            else{
                ptr = ptr.next;
            }
        }

        return head;
    }
}
