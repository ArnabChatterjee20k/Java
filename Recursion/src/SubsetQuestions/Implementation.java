package SubsetQuestions;

import java.util.ArrayList;

public class Implementation {
    public static void main(String[] args) {
        String str = "abc";
        subsets("", str);

        ArrayList<String> set = new ArrayList<>();
        getSubsets("", str, set);
        System.out.println(set);
        System.out.println(getSubsets2("", str));
    }

    // p = processed string
    // up = unprocessed string
    static void subsets(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        // either take the first char or ignore
        subsets(p + ch, up.substring(1));
        subsets(p, up.substring(1));
    }

    static void getSubsets(String p, String up, ArrayList<String> set) {
        if (up.isEmpty()) {
            set.add(p);
            return;
        }
        char ch = up.charAt(0);

        // either take the first char or ignore
        getSubsets(p + ch, up.substring(1), set);
        getSubsets(p, up.substring(1), set);
    }

    static ArrayList<String> getSubsets2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // either take the first char or ignore
        ArrayList<String> left = getSubsets2(p + ch, up.substring(1));
        ArrayList<String> right = getSubsets2(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
