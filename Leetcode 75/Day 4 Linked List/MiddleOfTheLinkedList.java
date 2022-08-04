public class MiddleOfTheLinkedList{

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

    public static ListNode middleNode(ListNode head) {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

         while (fast_ptr!= null && fast_ptr.next!= null){
             fast_ptr = fast_ptr.next.next;
             slow_ptr = slow_ptr.next;
         }
         return slow_ptr;
    }

    public static void main(String[] args) {
        ListNode head = newNode(5);
        head.next = newNode(10);
        head.next.next = newNode(15);
        head.next.next.next = newNode(20);
        head.next.next.next.next = newNode(25);

        System.out.print("\nList: ");
        printList(head);

        System.out.print("Middle of the Linked List: ");
        printList(middleNode(head));
        System.out.println();
    }
}