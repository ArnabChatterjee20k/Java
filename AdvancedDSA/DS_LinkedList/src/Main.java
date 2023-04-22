public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); 
        list.insertFirst(12);       
        list.insertFirst(2);       
        list.insertFirst(4);       
        list.insertFirst(122);       
        list.insertFirst(1);    

        list.insertLast(102);
        list.insertLast(12);

        list.insert(0, 1);
        list.insert(0, 0);

        list.deleteFirst();

        list.deleteLast();
        list.display();
        list.delete(3);
        list.display();

        // list.delete(0)
        // System.out.println(list.get(0));
        
        System.out.println(list.find(2));
        System.out.println(list.find(1112));



    }
}