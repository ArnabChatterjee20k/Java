public class Main {
    public static void main(String[] args) {
        // CircularLL list = new CircularLL();
        // list.insertFirst(12);
        // list.display();

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertRecursive(5,0);
        list.insertRecursive(1,1);
        list.insertRecursive(-1,2);
        list.insertRecursive(0,3);
        list.insertRecursive(12,4);
        list.display();
        list.bubbleSort();
        list.display();
    }
}