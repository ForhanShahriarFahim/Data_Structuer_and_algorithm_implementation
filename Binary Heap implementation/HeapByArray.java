package MinBinaryHeap;

public class HeapByArray {
    int [] arr;
    int sizeOfTree;

    public HeapByArray(int size){
        arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Empty heap has been created!");
    }

    public boolean isHeapEmpty(){
        if(sizeOfTree<=0){
            System.out.println("Tree is empty !");
            return true;
        }
        else {
            System.out.println("Tree is not empty !");
            return false;
        }
    }

    public void deleteHeap(){
        arr = null;
        System.out.println("Heap has been deleted !");
    }

    public void peek(){
        if(sizeOfTree==0){
            System.out.println("Heap is empty");
        }
        else{
            System.out.println("Head of the heap is: "+arr[1]);
        }
    }

    public void insertInHeap(int value){
        System.out.println("Inserting "+value+" "+"in the heap...");
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        HeapifyBottomToTop(sizeOfTree);
        System.out.println("Inserted "+value+" successfully in heap");
        levelOrder();
    }

    public void HeapifyBottomToTop(int index){
        int parent = index/2;
        if(index<=1){
            return;
        }
        if(arr[index]<arr[parent]){
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;

        }
        HeapifyBottomToTop(parent);
    }

    public int extractHeadOfHeap(){
        if(sizeOfTree == 0){
            System.out.println("Heap is empty !");
            return -1;
        }
        else {
            System.out.println("Head of the Heap is: "+arr[1]);
            System.out.println("Extracting it now...");
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            HeapifyTopToBottom(1);
            System.out.println("Successfully extracted value from the Heap");
            levelOrder();
            return extractedValue;
        }
    }

    public void HeapifyTopToBottom(int index){
        int left = 2*index;
        int right = (2*index)+1;
        int smallestChild = 0;
        if(sizeOfTree<left){
            return;
        }
        else if(sizeOfTree == left){
            if(arr[index]>arr[left]){
                int tmp = arr[index];
                arr[index] = arr[left];
                arr[left] = tmp;
            }
            return;
        }
        else {
            if(arr[left]<arr[right]){
                smallestChild = left;
            }
            else {
                smallestChild = right;
            }
            if(arr[index]>arr[smallestChild]){
                int tmp = arr[index];
                arr[index] = arr[left];
                arr[left] = tmp;
            }
        }
        HeapifyTopToBottom(smallestChild);
    }

    public void levelOrder(){
        System.out.println("Printing all the elements fo that heap...");
        for(int i=1;i<=sizeOfTree;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
}
