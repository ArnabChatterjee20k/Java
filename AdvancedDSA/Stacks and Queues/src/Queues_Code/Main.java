package Queues_Code;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        // queue.display();

        CircularQueue queue2 = new CircularQueue(5);
        for (int i = 0; i < 5; i++) {
            queue2.insert(i);
        }
        queue2.display();

        queue2.remove();
        System.out.println("");
        queue2.display();

        queue2.insert(30);
        System.out.println("");
        queue2.display();
        queue2.insert(30);
        queue2.insert(320);
        queue2.display();
    }
}
