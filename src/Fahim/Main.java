package Fahim;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtLast(18);
        list.insertAtLast(45);
        list.insertAtLast(12);
        list.insertAtFirst(10);
        list.insertAt(2,30);
        list.insertAt(0,0);
        list.deleteAt(5);

        list.show();
    }
}
