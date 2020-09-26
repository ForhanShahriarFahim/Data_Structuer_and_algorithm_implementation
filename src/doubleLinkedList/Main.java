package doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        doubleLinkedList dl = new doubleLinkedList();
        dl.insertAtLast(1);
        dl.insertAtLast(2);
        dl.insertAtLast(3);
        dl.insertAtLast(4);
        dl.insertAtFirst(0);
        dl.insertAtFirst(-1);
        dl.insertAt(2, 10);
        dl.deleteAtFirst();
        dl.deleteAtLast();
        dl.deleteAt(2);
        dl.display();

    }

}
