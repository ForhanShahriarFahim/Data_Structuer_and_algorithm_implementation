package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList {
    public class Node {
        int value;
        Node left,right;
        public Node(int data){
            value = data;
            left = right = null;
        }
    }

    Node root;
    BinarySearchTreeByLinkedList(){
        root = null;
    }

    public Node createNewNode(int value){
        Node node = new Node(value);
        return node;
    }

    void insert(int value){
        root = insert(root,value);
    }

    public Node insert(Node currentNode, int value){
        if(currentNode==null){
            System.out.println("Successfully inserted " + value + " in BST");
            return createNewNode(value);
        }
        if(value<=currentNode.value){
            currentNode.left = insert(currentNode.left, value);
        }
        else if(value>currentNode.value){
            currentNode.right = insert(currentNode.right,value);
        }
        return currentNode;
    }


    public void deleteNodeOfBST(int value){
        System.out.println("\n\nDeletiong " + value + " from BST...");
        deleteNodeOfBST(root,value);
    }
    public Node deleteNodeOfBST(Node root,int value){
        if(root==null){
            System.out.println("Value not found in the BST");
            return null;
        }
        if(value<root.value){
            root.left = deleteNodeOfBST(root.left,value);
        }
        else if(value>root.value){
            root.right = deleteNodeOfBST(root.right,value);
        }
        else{
            if(root.left != null && root.right != null){
                Node temp = root;
                Node minNodeForRight = minValue(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNodeOfBST(root.right,minNodeForRight.value);
            }
            else if(root.left != null){
                System.out.println("deleting "+value);
                return root.left;
            }
            else if(root.right != null){
                System.out.println("deleting "+value);
                return root.right;
            }
            else{
                root = null;
            }
        }
        return root;
    }
    public Node minValue(Node root){
        if(root.left==null){
            return root;
        }
        else{
            return minValue(root.left);
        }
    }

    void searchForValue(int value){
        searchForValue(root, value);
    }
    Node searchForValue(Node node,int value){
        if(node==null){
            System.out.println("Value "+value+" not found in the BST");
            return null;
        }
        else if(node.value == value){
            System.out.println("Value "+value+" found in the BST");
            return node;
        }
        else if(value<node.value){
            return searchForValue(node.left,value);
        }
        else{
            return searchForValue(node.right,value);
        }
    }
    public void levelOrderTraversal(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        System.out.println("Printing level order traversal of Tree...");
        if(root == null){
            System.out.println("Tree does not exists !");
            return;
        }
        while(!queue.isEmpty()){
            Node presentNode = queue.remove();
            System.out.print(presentNode.value+ " ");
            if(presentNode.left!=null)
            {
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        System.out.println();
    }



    public void deleteTree(){
        System.out.println("Deleting the full binary search tree");
        root = null;
        System.out.println("Tree deleted successfully");
    }
}
