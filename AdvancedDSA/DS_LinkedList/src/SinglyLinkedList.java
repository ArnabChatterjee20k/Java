public class SinglyLinkedList {
    private Node head;
    private Node tail;

    private int size;

    private class Node {
        private int value; // default value 0
        private Node next; // default value null

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return ""+this.value;
        }

    }

    public SinglyLinkedList() {
        this.size = 0;
    }

    // reading the list
    /**
     * 
     * @param index
     * @return the node at that index
     */
    public Node get(int index){
        
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value) return node;
            node = node.next;
        }
        return null;

    }

    public void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }
    
    
    // insertion
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        // that means only one element is present
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0) {
            insertFirst(val);
            return;
        }
        // we are taking size instead of size-1 as size will point to last index+1
        if(index == size){
            insertLast(val);
            return;
        }

        Node tempNode = head;
        // we are running from 1 as already handling 0 index is written in insertFirst
        for (int i = 1; i < index; i++) {
            tempNode = tempNode.next;
        }
        // insert 2 between 3 and 4
        // currently tempNode means 3
        // tempNode.next means 4
        // node means 2

        // pointing 3 to 2
        Node node = new Node(val, tempNode.next); // pointing next of the node to next of tempnode 
        // pointing 2 to 4
        tempNode.next = node;
        size++;
    }

    // recursive insertion
    public void insertRecursive(int val,int index){
        head = insertRec(val, index, head);
    }
    // we will be going from index to 0 by decrementing the index
    private Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }
    

    // deletion
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;

        tail.next = null;
        size--;
        return val;

    }

    public int delete(int index) {
        if(index == 0) return deleteFirst();
        if(index == size-1) return deleteLast();

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

}
