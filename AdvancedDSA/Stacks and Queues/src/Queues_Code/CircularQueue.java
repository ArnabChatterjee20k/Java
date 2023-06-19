package Queues_Code;

public class CircularQueue {
    protected int[] data;

    private static final int Default_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(int size) {
        data = new int[size];
    }

    public CircularQueue() {
        this(Default_SIZE);
    }

    public boolean insert(int item) {
        // O(1)
        if (isFull())
            return false;
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        // O(1)
        if (isEmpty())
            throw new Exception("Empty");

        int removed = data[front++];
        front = front % data.length;
        size++;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Empty");

        return data[front];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Empty");
        int i = front; // we cant directly manipulate the front
        do {
            System.out.print(data[i]+" ");
            i++;
            i %= data.length;
        } while (i != end);
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
