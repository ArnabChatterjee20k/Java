import java.util.Arrays;

public class NumberOfWords {
    public static void main(String[] args) {
        String str = "arnab     is a good boy";
        
        /** First we need to remove extra spaces then we have to count number of the words */
        System.out.println(Arrays.toString(str.split("\s+")));
        System.out.println(str.split("\s+").length);
    }
}
