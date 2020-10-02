package BinaryTreeUdemyPractice;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public BinaryTreeByLinkedList() {
        root = null;
    }

    void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            System.out.println("Successfully inserted new node at Root !");
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = node;
                System.out.println("Successfully inserted new node !");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = node;
                System.out.println("Successfully inserted new node !");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public void search(int value) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            if (presentNode.data == value) {

                System.out.println("Successfully found the value !");
                return;
            } else{
                if (presentNode.right != null) {
                    queue.add(presentNode.right);

                }
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
            }

        }
        System.out.println("Value did not found");
    }

/*    public Node getDeepestNode(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node presentNode = null;
        Node pl = null,pr = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
                pl = presentNode;
                pr = null;
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
                pr = presentNode;
                pl = null;
            }
        }
        return presentNode;
    }*/

    public void deleteNode(int value){

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node key_node = null,pl=null,pr = null, currentNode = null;
        while(!queue.isEmpty()){
            currentNode = queue.remove();
            if(currentNode.data == value){
                key_node = currentNode;
            }
            if(currentNode.left!=null){
                queue.add(currentNode.left);
                pl = currentNode;
                pr = null;
            }
            if(currentNode.right!=null){
                pr = currentNode;
                pl = null;
            }
        }
        if(key_node!=null){
            key_node.data = currentNode.data;
            if(pl!=null) pl.left = null;
            if(pr!=null) pr.right = null;
            System.out.println("Node is successfully deleted");
        }
        else
        {
            System.out.print("Node not found\n");
        }
    }



    void levelOrder() {
        if(root==null){
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            System.out.print(presentNode.data + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null)
                queue.add(presentNode.right);
        }
    }

    void inOrderTraversal(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        if (node.left != null) {
            inOrderTraversal(node.left);
        }
        System.out.print(node.data + " ");
        if (node.right != null)
            inOrderTraversal(node.right);
    }

    void postOrder(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        if (node.left != null) {
            inOrderTraversal(node.left);
        }

        if (node.right != null)
            inOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    void preOrder(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.print(node.data + " ");
        if (node.left != null) {
            inOrderTraversal(node.left);
        }

        if (node.right != null)
            inOrderTraversal(node.right);
    }
    public void deleteTree(){
        root = null;
        System.out.println("Whole Binary Tree deleted successfully");
    }
}


