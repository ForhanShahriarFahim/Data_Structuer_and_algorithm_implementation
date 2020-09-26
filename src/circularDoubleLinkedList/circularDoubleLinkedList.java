package circularDoubleLinkedList;

import circularSingleLinkedList.circularLinkedList;
import doubleLinkedList.doubleLinkedList;

public class circularDoubleLinkedList {
    public class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode.previous = newNode;
        } else {
            newNode.next = head;
            newNode.previous = tail;
            head.previous = newNode;
            head = newNode;
            tail.next = newNode;
        }
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode.previous = newNode;
        } else {
            newNode.next = head;
            newNode.previous = tail;
            head.previous = newNode;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAt(int index,int data){
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
                head.previous = tail;
                tail.next = head;

            } else {
                head.next = head.previous = head = tail = null;
            }
        }
    }

    public void deleteAtLast(){
        Node newNode = tail;
        if(head==null){
            System.out.println("Link list is empty");
        }
        else
        {
            if(head!=tail){
                tail = tail.previous;
                tail.next = head;
                head.previous = tail;
            }
            else{
                head.next = head.previous = head = tail = null;
            }
        }
    }

    public void deleteAt(int index){
        Node n1 = null;
        Node n = head;
        if(index==0)
        {
            head = head.next;
            tail.next = head;
        }
        else
        {
            for(int i=0;i<index-1;i++)
            {
                n = n.next;
            }

            n.next = n.next.next;

            n.next.previous = n;
        }

    }

    public void display(){
        Node node = head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            do{
                System.out.print(node.data+" ");
                node = node.next;
            }while (node != head);


        }
    }
}
