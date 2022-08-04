public class MergeTwoSortedLists {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyListNode = new ListNode(0);
        ListNode tail = dummyListNode;

        while(list1!=null && list2!=null){
            if (list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 == null){
            tail.next = list2;
        }
        else{
            tail.next = list1;
        }
        return dummyListNode.next;
    }
    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }
        
        if (list1 == null){
            return list2;
        }
        
        if (list2 == null){
            return list1;
        }
        
        if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    static void printList(ListNode Node){
        while (Node != null) {
            System.out.print(Node.val+ " -> ");
            Node = Node.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode list1 = newNode(5);
        list1.next = newNode(10);
        list1.next.next = newNode(15);
        list1.next.next.next = newNode(20);

        ListNode list2 = newNode(2);
        list2.next = newNode(4);
        list2.next.next = newNode(8);
        list2.next.next.next = newNode(10);

        System.out.print("\nList1: ");
        printList(list1);
        System.out.print("List2: ");
        printList(list2);

        ListNode mergedList1 = mergeTwoLists1(list1, list2);
        System.out.print("Merged List (Using Recursion): ");
        printList(mergedList1);
        System.out.println("");

        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(mergedList);
    }
}
