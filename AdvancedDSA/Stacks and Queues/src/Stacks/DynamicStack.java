package Stacks;

public class DynamicStack extends Custom_Stack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        // taking care if the stack is full
        if (this.isFull()) {
            // double the size of prev data
            int[] temp = new int[data.length * 2];

            // copying all items
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        // now do the operation normally
        return super.push(item);
    }
}
