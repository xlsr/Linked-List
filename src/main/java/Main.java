import DesignLinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args ) {
        try {
            MyLinkedList linkedList = new MyLinkedList();
            linkedList.addAtHead(1);
            linkedList.addAtTail(3);
            linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
            linkedList.get(1);            // returns 2
            linkedList.deleteAtIndex(1);  // now the linked list is 1->3
            linkedList.get(1);            // returns 3
        }catch (Exception e){
            System.out.print("Error:"+e.getMessage());
        }
    }
}
