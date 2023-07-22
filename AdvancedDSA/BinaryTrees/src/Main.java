import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTrees trees = new BinaryTrees();
        // trees.populate(scanner);
        // trees.display();
        // trees.prettyDisplay();
        
        BinarySearchTrees tree = new BinarySearchTrees();

        // tree.populate(new int[] {1,2,12,3,-1,4,4,22,5});
        
        tree.populateSorted(new int[]{1,2,3,4,5});
        tree.display();
        tree.preOrder();
        System.out.println();
        tree.inOrder(); // as BST so it will print in Sorted order
        System.out.println();
        tree.postOrder();
    }
}