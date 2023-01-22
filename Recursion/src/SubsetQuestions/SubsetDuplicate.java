package SubsetQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetDuplicate {
    public static void main(String[] args) {
        System.out.println(subset(new int[] { 1, 2, 2 }));
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

        outer.add(new ArrayList<>()); // first empty list

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous are same then start = end+1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));// copying the current index element to a
                                                                            // new list to put new elment to it
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
