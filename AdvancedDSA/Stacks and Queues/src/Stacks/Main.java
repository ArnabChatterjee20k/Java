package Stacks;

public class Main {
    public static void main(String[] args) throws Exception {
        Custom_Stack stack = new Custom_Stack();
        // stack.pop();
        stack.push(0);
        stack.push(12);
        stack.push(1);
        stack.push(44);

        System.out.println(stack.peek());
        
        DynamicStack newStack = new DynamicStack();
        
        for (int i = 0; i < 100; i++) {
            newStack.push(i);
        }
        System.out.println(newStack.peek());
    
    }
}
