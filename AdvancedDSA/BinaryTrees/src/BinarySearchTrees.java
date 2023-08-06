import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTrees {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BinarySearchTrees() {
    }

    public int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // insertion
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        // for new nodes
        if (node == null)
            return new Node(value);
        // if the new value is less than the current node value 
        // go to left of the current node
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        // if the new value is greater than the current node value 
        // go to right of the current node
        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node; // if it is a old node.
                     // Just return the existing node
                     // Also due to insertion the height of every node has changed
                     // so do change the height while returning

    }

    public void populate(int[] nums) {
        for (int e : nums)
            insert(e);
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start == end)
            return;
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);// left
        populateSorted(nums, mid + 1, end); // right
    }

    // diplay
    public void display() {
        display(root, "Root Node");
    }

    private void display(Node node, String details) {
        if (node == null)
            return;
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + ":");
        display(node.right, "Right child of " + node.getValue() + ":");
    }

    // balancing
    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 // checking the root
                &&
                isBalanced(node.left) // checking the sub left tree
                &&
                isBalanced(node.right) // checking the sub right tree
        ;
    }

    // traversals

    // DFS
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // BFS
    public void BFS() {
        // we can also make a single list and append their
        // But here we are showing level by level
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            System.out.println(res);
            return;
        }
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = q.poll();
                level.add(node.value);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }

            res.add(level);
        }

        System.out.println(res);
    }
}
