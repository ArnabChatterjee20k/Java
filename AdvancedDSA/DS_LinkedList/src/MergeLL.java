public class MergeLL {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        for (int i = 0; i < 5; i++) {
            list1.insertLast(i);
        }

        SinglyLinkedList list2 = new SinglyLinkedList();
        for (int i = 4; i < 20; i += 2) {
            list2.insertLast(i);
        }

        // list1.display();
        // list2.display();

        SinglyLinkedList result =  SinglyLinkedList.merge(list1, list2);
        result.display();
    }
}
