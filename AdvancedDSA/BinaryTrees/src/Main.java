import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees trees = new BinaryTrees();
        trees.populate(scanner);
        // trees.display();
        trees.prettyDisplay();

    }
}
