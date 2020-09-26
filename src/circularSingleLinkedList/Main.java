package circularSingleLinkedList;

public class Main {
    public static void main(String[] args) {
        circularLinkedList cl = new circularLinkedList();
        cl.insertAtLast(1);
        cl.insertAtLast(2);
        cl.insertAtLast(3);
        cl.insertAtLast(4);
        cl.insertAtFirst(0);
        cl.deleteAt(4);
        cl.display();

    }
}
