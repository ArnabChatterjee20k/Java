public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(12);
        heap.insert(0);
        heap.insert(1);

        System.out.println(heap.remove());

    }
}
