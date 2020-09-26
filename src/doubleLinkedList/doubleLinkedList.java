package doubleLinkedList;

public class doubleLinkedList {
    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = head.next = null;
            tail.previous = tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            newNode.next = null;
        }

    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = null;
            head.previous = null;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            newNode.previous = null;
        }
    }

    public void insertAt(int index, int data) {
        Node newNode = new Node(data);
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        newNode.previous = n;
        newNode.next = n.next;
        n.next.previous = newNode;
        n.next = newNode;

    }

    public void deleteAtFirst() {
        Node newNode = head;
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            if (head != tail) {
                head = head.next;
                newNode.previous = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void deleteAtLast() {
        Node tmp = tail;
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            if (head != tail) {
                tail.previous.next = null;
                tail = tail.previous;
                tmp.previous = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void deleteAt(int index) {
        Node current = head;
        if (head == null) {
            head = tail = null;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.previous = current;
        }
    }


    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list does not exists");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
