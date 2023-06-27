package Questions;

import java.util.Stack;

public class DeleteMiddleOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int mid = stack.size()/2;

        System.out.println(stack);
        deleteMid(stack, mid, 0);

        System.out.println(stack);
    }
    public static void deleteMid(Stack<Integer> stack,int mid,int curIndex) {
        if(stack.isEmpty()) return;
        int val = stack.pop();
        deleteMid(stack, mid,curIndex+1);
        if(curIndex!=mid)stack.push(val);
    }
}
