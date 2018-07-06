import DesignLinkedList.MyLinkedList;
import LinkedListCircle.ListNode;
import LinkedListCircle.Solution;

public class Main {
    public static void main(String[] args ) {
        try {
            ////////////////
            System.out.println("Design Linked List");
            MyLinkedList linkedList = new MyLinkedList();
            linkedList.addAtHead(1);
            linkedList.addAtTail(3);
            linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
            linkedList.get(1);            // returns 2
            linkedList.deleteAtIndex(1);  // now the linked list is 1->3
            linkedList.get(1);            // returns 3
            ///////////
            System.out.println("Linked List Cycle");
            //Given a linked list, determine if it has a cycle in it.
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
