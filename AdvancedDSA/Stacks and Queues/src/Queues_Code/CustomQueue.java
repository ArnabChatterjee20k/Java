package Queues_Code;

// we can do it by having 2 pointers also with one pointer
// one pointer is little bit hard
// so lets implement that
public class CustomQueue {
    private int[] data;

    private static final int Default_SIZE = 10;

    int end = 0; // here we are taking 0 but we can also take the -1

    public CustomQueue(int size) {
        data = new int[size];
    }

    public CustomQueue() {
        this(Default_SIZE);
    }

    public boolean insert(int item) {
        // O(1)
        if (isFull())
            return false;
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        // O(N) as we are shift to left by N
        if (isEmpty())
            throw new Exception("Empty");

        int removed = data[end];
        // shift the elements to left
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }

        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Empty");

        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
    }
    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
