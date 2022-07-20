import java.util.ArrayList;

public class Syntax {
    public static void main(String[] args) {
        /*
         * Syntax
         * this is basically the constructor for creating a new ArrayList object
         * ArrayList<Integer> list = new ArrayList<>();
         * 
         * or
         * 
         * ArrayList<Integer> list = new ArrayList<>(n);
         * 
         * n is the initial size
         * 
         */

        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
