package Questions;

import java.util.LinkedList;
import java.util.Queue;

// can be done using stack, recursion,etc
public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 13; i++) {
            queue.add(i);
        }
        recursion(queue);
        System.out.println(queue);
    }
    public static void recursion(Queue<Integer> queue) {
        if(queue.isEmpty()) return;
        int element = queue.poll();
        recursion(queue);
        queue.add(element);
    }
}
