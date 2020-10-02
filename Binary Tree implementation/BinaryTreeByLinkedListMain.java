package BinaryTreeUdemyPractice;


public class BinaryTreeByLinkedListMain {
    public static void main(String[] args) {
        BinaryTreeByLinkedList bt = new BinaryTreeByLinkedList();
        System.out.println("Inserting 10 nodes to tree: ");
        for(int i=1;i<=10;i++)
            bt.insert(i*10);
        System.out.println("\nPrinting data in leve Order: ");
        bt.levelOrder();

        System.out.println("\nInorder traversal: ");
        bt.inOrderTraversal(bt.root);

        System.out.println("\nPost Order Traversal: ");
        bt.postOrder(bt.root);

        System.out.println("\nPre Order Traversal: ");
        bt.preOrder(bt.root);

        System.out.print("\nSearch for value: ");
        bt.search(100);
        System.out.println("\nDelete a node: ");
        bt.deleteNode(10);
        bt.inOrderTraversal(bt.root);
        System.out.println("\nDeleting the entire tree");
        bt.deleteTree();
        bt.levelOrder();
    }


}
