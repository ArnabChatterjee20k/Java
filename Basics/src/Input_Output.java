import java.util.Scanner; // for input
public class Input_Output {
    public static void main(String[] args) {
        // println for new line after string
        System.out.println("Hello world!");
        System.out.print("Hello world!");
        System.out.println("Hello world!");

        // making the scanner object
        Scanner input_obj = new Scanner(System.in); // for inputting from keyboard

        // message
        System.out.println("Enter your name , age ,salary");
        // taking the inputs
        String name = input_obj.nextLine();
        int age = input_obj.nextInt();
        float salary = input_obj.nextFloat();
        // output
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("salary:"+salary);
    }
}
