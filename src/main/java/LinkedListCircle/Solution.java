package LinkedListCircle;

public class Solution {

    private ListNode getListNode(ListNode head, int step){
         if (head==null) return null;
         ListNode ret=head.next;
         while (step>1&&ret!=null ){
            ret=ret.next;
            step--;
         }
         return ret;
    }

    public boolean hasCycle(ListNode head) {
        if (head== null) return false;
        ListNode runner1 = head;
        ListNode runner2 = head;
        do{
            runner1 = getListNode(runner1, 1);
            runner2 = getListNode(runner2, 2);
            if (runner1==null) return false;
            if (runner2==null) return false;
            if (runner1.equals(runner2)) return true;
        }while (runner1!=null&&runner2!=null);
        return false;
    }

}
