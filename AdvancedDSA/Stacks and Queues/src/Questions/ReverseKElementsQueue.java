package Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        reverseKElements(queue, 3);

        System.out.println(queue);
    }

    public static void reverseKElements(Queue<Integer> queue , int k) {
        Stack<Integer> stack = new Stack<Integer>();
        int remaining = queue.size() - k;
        // pushing the the first k elements in stack. so that they get reversed
        while(!queue.isEmpty() && k>0){
            stack.push(queue.poll());
            k--;
        }

        // pushing the the the reverse ordered elements in the queue
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        
        // dequeuing the remaining elements from front and adding them to the last of the queue
        while(remaining>0){
            queue.add(queue.poll());
            remaining--;
        }
    }

}