package Queues_Code;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuilt_Ex {
    public static void main(String[] args) {
        // Here Queue is an interface
        // LinkedList is the class
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(12);
        queue.add(5);

        System.out.println(queue.peek()); // displaying the head of the queue
        
        queue.remove();
        System.out.println(queue.peek()); // peek will change

        // Doubly Ended Queue(Dequeue)
        // Deque is the interface
        // ArrayDeque is the class which provides all the methods
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(12);
        deque.addFirst(12);
        deque.removeFirst();
    }
}
