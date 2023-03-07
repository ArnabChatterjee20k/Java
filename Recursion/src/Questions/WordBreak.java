package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {
    public static void main(String[] args) {
        String[] s = {"car","ca","rs"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));
        boolean res = wordBreak("cars",list);
    }
    static boolean wordBreak(String s, ArrayList<String> wordDict) {
        // if my whole string gets emptied then all words are present
        if(s.isEmpty()) return true;
        for(String word:wordDict){
            if(s.startsWith(word)){
                boolean result = wordBreak(s.substring(word.length()),wordDict);
                if (result) return result; // we will return true only here. Neglect false as it is handled by the empty condition
            }
        }

        return false;
    }
}
