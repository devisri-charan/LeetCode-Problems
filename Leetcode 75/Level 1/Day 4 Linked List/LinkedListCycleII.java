import java.util.HashSet;

public class LinkedListCycleII {
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

    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while(head != null){
            if(hashSet.contains(head)){
                return head;
            }
            hashSet.add(head);
            head = head.next;
        }
        
        return null;
    }

    public static ListNode detectCycle1(ListNode head) {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        while (fast_ptr!= null && fast_ptr.next!= null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
            if (slow_ptr == fast_ptr){
                slow_ptr = head;
                while (slow_ptr != fast_ptr){
                    slow_ptr = slow_ptr.next;
                    fast_ptr = fast_ptr.next;
                }
                return slow_ptr;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = newNode(5);
        head.next = newNode(10);
        head.next.next = newNode(15);
        head.next.next.next = newNode(20);
        head.next.next.next.next = head;

        System.out.println(detectCycle(head));
    }
}
