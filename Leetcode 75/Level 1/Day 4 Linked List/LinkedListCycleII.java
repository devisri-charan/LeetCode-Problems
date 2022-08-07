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

    public static void main(String[] args) {
        ListNode head = newNode(5);
        head.next = newNode(10);
        head.next.next = newNode(15);
        head.next.next.next = newNode(20);
        head.next.next.next.next = head;

        System.out.println(detectCycle(head));
    }
}
