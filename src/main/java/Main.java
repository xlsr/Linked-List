public class Main {
    public static void main(String[] args ) {
        try {
            System.out.println("Linked List Cycle2");
            //Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
            LinkedListCycle2.Solution solution2 = new LinkedListCycle2.Solution();

            LinkedListCycle2.ListNode head = new LinkedListCycle2.ListNode(1);
            head.next = new LinkedListCycle2.ListNode(2);
            //head.next.next = new LinkedListCycle2.ListNode(3);
            //head.next.next.next = new LinkedListCycle2.ListNode(4);
            //head.next.next.next.next = new LinkedListCycle2.ListNode(5);
            //head.next.next.next.next.next = new LinkedListCycle2.ListNode(6);
            //head.next.next.next.next.next.next = head.next.next.next.next;
            //head.next.next.next.next.next.next = head.next.next;
            LinkedListCycle2.ListNode ret = solution2.detectCycle(head);
            if (ret!=null) System.out.println("Cycle begins "+ret.val);
            else System.out.println("Cycle begins "+ret);

        }catch (Exception e){
            System.out.print("Error:"+e.getMessage());
        }
    }
}
