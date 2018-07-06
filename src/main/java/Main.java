import DesignLinkedList.MyLinkedList;
import LinkedListCircle.ListNode;
import LinkedListCircle.Solution;

public class Main {
    public static void main(String[] args ) {
        try {

            Solution solution = new Solution();
            ListNode head = new ListNode(1);
            //ListNode node = new ListNode(2);
            //head.next = node;
            //node.next = new ListNode(3);
            //node.next.next = new ListNode(4);
            System.out.println(solution.hasCycle(head));

        }catch (Exception e){
            System.out.print("Error:"+e.getMessage());
        }
    }
}
