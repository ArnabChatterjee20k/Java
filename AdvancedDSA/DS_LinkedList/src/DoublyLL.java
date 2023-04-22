// We are not using tail here to show how to do things without tail
// can be done in way with tail as we have done in singly linked list
public class DoublyLL {
    Node head;
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
    }
    
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        // if list is empty
        if(head != null){
            // if head is null then no prev
            // null pointer exception
            head.prev = node;
        }

        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        
        node.next = null;
        
        // if list is empty
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        // if the list is not empty
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after , int val){
        // p -> n given
        // answer should be p -> node -> n 
        Node p = find(after);
        if(p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        // as p was pointing to n previously
        node.next = p.next;
        p.next = node;
        node.prev = p;

        // suppose we are inserting at last
        // then the next is pointing to null
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value) return node;
            node = node.next;
        }
        return null;
    }
    public void display() {
        Node tempNode = head;
        Node last = null;
        while (tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            last = tempNode;
            tempNode = tempNode.next;
        }
        System.out.println("END");

        System.out.println("Print In Reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
}
