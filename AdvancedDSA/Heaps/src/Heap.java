import java.util.ArrayList;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    // helper functions for returning the indices of parents , left and right
    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Empty list");
        }

        T temp = list.get(0);
        T last = list.get(list.size() - 1);

        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void upHeap(int index) {
        if (index == 0)
            return;
        int parentIdx = parent(index);
        if (list.get(index).compareTo(list.get(parentIdx)) < 0) {
            swap(index, parentIdx);
            upHeap(parentIdx);
        }
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        // checking if the current min is actually min or not

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = left;
        }

        // now if min is not equals to the current index that means either left or right
        // is assigned to min
        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }
}