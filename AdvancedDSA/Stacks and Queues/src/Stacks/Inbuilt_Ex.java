package Stacks;

import java.util.Stack;

public class Inbuilt_Ex {
    public static void main(String[] args) {
        // Stack is the class
        Stack<Object> stack = new Stack<>();
        stack.push("Arnab");
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
