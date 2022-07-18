package switch_case;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        /*
        * Old syntax
        * switch(expression){
        * case one:
        *   // do something
        * }
        * case two:
        *   // do something
        *
        * default:
        *   // do something
        *
        * */
        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Red");
                break;
            case "Orange":
                System.out.println("Orange");
                break;
            default:
                System.out.println("Not valid fruit");
        }

        // enhanced syntax(no break required here)
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Red");
            case "Orange" -> System.out.println("Orange");
            case "Grapes" ->{
                System.out.println("greenish");
            } // for multiple lines
            default -> System.out.println("Not valid fruit");
        }
    }
}
