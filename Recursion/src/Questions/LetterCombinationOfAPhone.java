package Questions;

import java.util.ArrayList;

public class LetterCombinationOfAPhone {
    public static void main(String[] args) {
        combine("", "12");
        System.out.println(combine2("", "12"));
    }

    static void combine(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';// getting first digit in form of number
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            combine(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> combine2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(combine2(p + ch, up.substring(1)));
        }
        return list;
    }
}