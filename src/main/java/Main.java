import DesignLinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args ) {
        try {
            MyLinkedList myLinkedList = new MyLinkedList();
            System.out.print("Get 0 "+myLinkedList.get(0)+"\n");
            myLinkedList.addAtHead(1);
            System.out.print("Get 0 "+myLinkedList.get(0)+"\n");
            myLinkedList.addAtHead(2);
            System.out.print("Get 0 "+myLinkedList.get(0)+"\n");
            myLinkedList.addAtTail(3);
            System.out.print("Get 2 "+myLinkedList.get(2)+"\n");
        }catch (Exception e){
            System.out.print("Error:"+e.getMessage());
        }
    }
}
