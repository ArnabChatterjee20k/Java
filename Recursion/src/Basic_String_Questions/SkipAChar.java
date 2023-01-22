package Basic_String_Questions;

public class SkipAChar {
    public static void main(String[] args) {
        String inputString = "bacbbbbbbbcad";
        char charToBeSkipped = 'b';

        String ans = skip1(inputString, "", charToBeSkipped, 0);
        System.out.println(ans);

        skip2(inputString, "", charToBeSkipped);
        System.out.println(skip3(inputString, charToBeSkipped));
    }

    static String skip1(String input, String ans, char charToBeSkipped, int pointer) {
        if (pointer >= input.length()) {
            return ans;
        }
        if (input.charAt(pointer) == charToBeSkipped) {
            return skip1(input, ans, charToBeSkipped, pointer + 1);
        }
        ans += input.charAt(pointer);
        return skip1(input, ans, charToBeSkipped, pointer + 1);
    }

    static void skip2(String input, String ans, char charToBeSkipped) {
        if (input.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = input.charAt(0);
        if (ch == charToBeSkipped) {
            skip2(input.substring(1), ans, charToBeSkipped);
        } else {
            skip2(input.substring(1), ans + ch, charToBeSkipped);
        }
    }

    static String skip3(String input, char charToBeSkipped) {
        if (input.isEmpty()) {
            return "";
        }
        // basically we are making a substring of input at every call. So 0 will be
        // pointing to the first char of substring and 1 to second char

        char ch = input.charAt(0);

        if (ch == charToBeSkipped) {
            return skip3(input.substring(1), charToBeSkipped);
        } else {
            // add the char when it is not equal to charToBeSkipped
            return ch + skip3(input.substring(1), charToBeSkipped);
        }
    }
}
