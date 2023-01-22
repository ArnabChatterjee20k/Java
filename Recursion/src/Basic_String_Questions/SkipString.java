package Basic_String_Questions;

public class SkipString {
    public static void main(String[] args) {
        String inputString = "bappleurn";
        String stringToBeSkipped = "apple";
        System.out.println(skip(inputString, stringToBeSkipped));
        System.out.println(skipWithCondition(inputString, "app", "apple"));
        System.out.println(skipWithCondition("bappc", "app", "apple"));

    }

    static String skip(String inputString, String stringTObeSkipped) {
        if (inputString.isEmpty()) {
            return "";
        }

        char ch = inputString.charAt(0);

        if (inputString.startsWith(stringTObeSkipped)) {
            return skip(inputString.substring(stringTObeSkipped.length()), stringTObeSkipped);
        } else {
            return ch + skip(inputString.substring(1), stringTObeSkipped);
        }
    }

    static String skipWithCondition(String inputString, String stringTObeSkipped, String stringNotToSkip) {
        if (inputString.isEmpty()) {
            return "";
        }
        char ch = inputString.charAt(0);

        if (inputString.startsWith(stringTObeSkipped) && !inputString.startsWith(stringNotToSkip)) {
            return skipWithCondition(inputString.substring(stringTObeSkipped.length()), stringTObeSkipped,
                    stringNotToSkip);
        } else {
            return ch + skipWithCondition(inputString.substring(1), stringTObeSkipped, stringNotToSkip);
        }
    }
}
