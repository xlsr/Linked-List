package DesignLinkedList;

public class Linked {
    private int value;
    private Linked link;

    public Linked(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Linked getLink() {
        return link;
    }

    public void setLink(Linked link) {
        this.link = link;
    }
}
