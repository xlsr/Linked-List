package LinkedListCycle2;

public class Solution {

    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode walker = head;
        ListNode runner = head;
        ListNode el = null;
        while(runner.next!=null && runner.next.next!=null && el==null ) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) el = walker;
        }
        if (el==null) return null;
        walker = head;
        while(walker != runner){
            walker = walker.next;
            runner = runner.next;
        }
        return walker;
    }

}
