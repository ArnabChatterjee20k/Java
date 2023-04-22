public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(12);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(99);

        list.display();
        list.insert(99, 100);
        list.display();
    }
}