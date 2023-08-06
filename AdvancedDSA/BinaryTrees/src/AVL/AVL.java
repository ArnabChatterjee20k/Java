package AVL;
public class AVL {
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

    public AVL() {
    }

    public int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public int height(){
        return height(root);
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
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                // left left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            // right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // right right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // left right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1); // +1 for P
        c.height = Math.max(height(c.left), height(c.right) + 1); // +1 for P

        return p;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right; // p.left.right

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1); // +1 for P
        c.height = Math.max(height(c.left), height(c.right) + 1); // +1 for P

        return c;
    }
}
