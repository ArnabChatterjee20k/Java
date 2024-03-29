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


    // merge operation
    public static SinglyLinkedList merge(SinglyLinkedList first,SinglyLinkedList second){
        Node f = first.head;
        Node s = second.head;

        SinglyLinkedList ans = new SinglyLinkedList();
        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        // adding the remaining elements
        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;

    }

    // sorting
    public void bubbleSort() {
        bubbleSort(size-1, 0);
    }
    private void bubbleSort(int row,int col){
        if(row==0) return;
        if(col<row){
            Node first = get(col);
            Node second = get(col+1);

            if(first.value>second.value){
                // swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }

                else if(second == tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }

                else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }
        else{
            bubbleSort(row-1, 0);
        }
        
    }

    public void recurseReverse(){
        recurseReverse(null, head);
        // System.out.println(tail.next);
        // System.out.println(head.next);
    }

    // recursion reverse
    private void recurseReverse(Node prev,Node cur){
        if(cur == null) {
            // we are at the last means
            // prev at last node and cur at null
            // prev is now the head
            // otherwise we will not be able to keep track of the head at last
            tail = head;//no need to change the tail if you are not having tail
            head = prev;
            return;

            // if want to return the node
            // return the prev as prev is head only
        };
        recurseReverse(cur, cur.next);
        // System.out.println(cur+" "+prev);
        cur.next = prev;
    }

    // iterative reversal
    public void reverse(){
        if(size<2) return ;

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev; // reversing
            prev = present;
            present = next;
            if(next!=null) next = next.next;
        }
        head = prev; // as the list is reversed
    }

}
