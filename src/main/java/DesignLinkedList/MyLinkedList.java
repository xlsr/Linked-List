package DesignLinkedList;

public class MyLinkedList {

    private Linked head = null;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (head==null)
           return -1;
        Linked link = head;
        while (index>0&&link!=null){
            index--;
            link=link.getLink();
        }
        if (link !=null) return link.getValue();
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Linked linked = new Linked(val);
        if (head==null) head = linked;
        else {
            linked.setLink(head);
            head = linked;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Linked linked = new Linked(val);
        if (head==null) head = linked;
        else {
            Linked link = head;
            while (link.getLink()!=null){
                link=link.getLink();
            }
            link.setLink(linked);
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Linked linked = new Linked(val);
        if (head==null && index==0) head = linked;
        else {
            if (head==null) return;

            Linked link = head;
            index--;
            while (link.getLink()!=null && index>0){
                link=link.getLink();
                index--;
            }
            if (index==0){
                linked.setLink(link.getLink());
                link.setLink(linked);
            }
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Linked link = head;
        index--;
        while (index>0&&link!=null){
            index--;
            link=link.getLink();
        }
        if (link!=null){
            if (link.getLink()!=null)
                link.setLink(link.getLink().getLink());
        }
    }

}
