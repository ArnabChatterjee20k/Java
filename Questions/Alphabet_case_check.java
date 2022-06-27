import java.util.Scanner;
public class Alphabet_case_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        /* we are taking input in form of string
        *  input.next() is used to read strings
        *  Later on it is converted to char so we are trimming it
        *  char takes only one letter and if we dont
        *  do trimming and char at we will get error
        *  of incompatible type.
        *
        *  char at returns character type
        * */

        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("uppercase");
        } else {
            System.out.println("Not alphabet");
        }

        // another method
        int ascii_value = ch; // implicit type casting
        if(ch>=65 && ch<=90){
            System.out.println("uppercase");
        } else if (ch>=97 && ch<=122) {
            System.out.println("lowercase");
        } else {
            System.out.println("Not alphabet");
        }
    }
}
