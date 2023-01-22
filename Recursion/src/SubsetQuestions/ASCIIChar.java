package SubsetQuestions;

public class ASCIIChar {
    public static void main(String[] args) {
        subsets("", "ab");
    }
    static void subsets(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        // either take the first char or ignore
        subsets(p + ch, up.substring(1));
        subsets(p, up.substring(1));
        subsets(p+(ch+0), up.substring(1));
    }
}
