package SubsetQuestions;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        getPermutaion("", "abc");
        System.out.println(getPermutationSet("", "abc"));
        System.out.println(permutationsCount("", "abcd"));
    }

    static void getPermutaion(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            // putting the first char of up at multiple posn of processed.
            // the number of function calls is depending on size of processed string.
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            getPermutaion(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> getPermutationSet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String secnd = p.substring(i, p.length());
            ans.addAll(getPermutationSet(first + ch + secnd, up.substring(1))); // extending the returned list to ans //
                                                                                // list
        }
        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
