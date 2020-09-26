package Fahim;

public class LinkedList {
    Node head;

    public void insertAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;
        }
    }

    public void insertAtFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        if (index == 0) {
            insertAtFirst(data);

        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index){
        Node n1 = null;
        Node n = head;
        if(index==0)
        {
            head = head.next;
        }
        else
        {
            for(int i=0;i<index-1;i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }

    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}
