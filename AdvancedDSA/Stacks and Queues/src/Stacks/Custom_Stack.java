package Stacks;

public class Custom_Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Custom_Stack() {
        // calling the constructor
        this(DEFAULT_SIZE);
    }

    public Custom_Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull())
            return false;
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty())
            throw new Exception("Cant pop from empty stack");
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty())
            throw new Exception("Cant peek in empty stack");
        return data[ptr];
    }

    protected boolean isFull() {
        return ptr == data.length - 1; // ptr is already at last index
    }

    protected boolean isEmpty() {
        return ptr == -1;
    }
}