public class reverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
    
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next; 
        }
    }
    
    static ListNode newNode(int val){
        ListNode temp = new ListNode();
        temp.val = val;
        temp.next = null;
        return temp;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr!=null){
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
        
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    static void printList(ListNode Node){
        while (Node != null) {
            System.out.print(Node.val+ " -> ");
            Node = Node.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = newNode(5);
        head.next = newNode(10);
        head.next.next = newNode(15);
        head.next.next.next = newNode(20);

        
        System.out.print("\nList1: ");
        printList(head);

        ListNode reversedList = reverseList(head);
        System.out.print("Reverse Linked List: ");
        printList(reversedList);
        System.out.println();
    }
}
