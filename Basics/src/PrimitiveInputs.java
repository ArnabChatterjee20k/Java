import java.util.Scanner;

public class PrimitiveInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // integer
        System.out.print("Please enter roll "); // taking input in same line
        int rollno = input.nextInt();
        System.out.println("Roll is "+rollno);

        // sum of 2 integers
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();

        System.out.println(number2+number1);
    }
}
