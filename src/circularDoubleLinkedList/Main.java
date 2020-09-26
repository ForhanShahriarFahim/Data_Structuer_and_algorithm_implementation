package circularDoubleLinkecdlist;

import circularDoubleLinkedList.circularDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        circularDoubleLinkedList cdl = new circularDoubleLinkedList();
        cdl.insertAtLast(1);
        cdl.insertAtLast(2);
        cdl.insertAtLast(3);
        cdl.insertAtLast(4);
        cdl.insertAtFirst(0);
        cdl.insertAtFirst(-1);
        cdl.insertAt(2, 10);
        cdl.deleteAtFirst();
        cdl.deleteAtLast();
        cdl.deleteAt(2);
        cdl.display();
    }
}
