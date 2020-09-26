package circularSingleLinkedList;

import SingleLinkedList.Node;

public class circularLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newNode;
            newNode.next = head;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newNode;
            newNode.next = head;
        }
        else
        {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

    }
    public void insertAt(int index,int data){
        Node newNode = new Node(data);
        Node n = head;
        if (index == 0) {
            insertAtFirst(data);

        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            newNode.next = n.next;
            n.next = newNode;
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
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
            tail.next = head;
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
