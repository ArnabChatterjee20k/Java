public class CircularLL {
    private Node head;
    private Node tail;
    
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = next;
        }
    }


    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = head;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node tempNode = head;
        if(head!=null){
            do {
                System.out.println(tempNode.val + " -> ");
                tempNode = tempNode.next;
            } while (tempNode!=head);
        }
    }

}
