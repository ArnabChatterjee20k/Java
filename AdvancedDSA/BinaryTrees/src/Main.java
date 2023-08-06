import java.util.Scanner;
import AVL.AVL;
public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTrees trees = new BinaryTrees();
        // trees.populate(scanner);
        // trees.display();
        // trees.prettyDisplay();
        
        // BinarySearchTrees tree = new BinarySearchTrees();
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        // if it is self balancing it will give log 1000 that is 3
        System.out.println(tree.height());
        
        // tree.populateSorted(new int[]{1,2,3,4,5});
        // tree.display();
        // tree.preOrder();
        // System.out.println();
        // tree.inOrder(); // as BST so it will print in Sorted order
        // System.out.println();
        // tree.postOrder();
        // System.out.println();
        // tree.BFS();
    }
}