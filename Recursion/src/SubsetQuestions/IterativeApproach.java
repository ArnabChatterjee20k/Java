package SubsetQuestions;

import java.util.ArrayList;

public class IterativeApproach {
    public static void main(String[] args) {
        System.out.println(subset(new int[] { 1, 2, 3 }));
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

        outer.add(new ArrayList<>()); // first empty list

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));// copying the current index element to a
                                                                            // new list to put new elment to it
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}