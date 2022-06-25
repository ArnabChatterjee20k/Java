import java.util.Scanner;  // Import the Scanner class
class Even_odd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");

        int number = input.nextInt(); // Read user input
        String message = "Number is- ";
        
        int remainder = number%2;

        if(remainder==0){
            System.out.println(message+"even");
        }else{
            System.out.println(message+"odd");
        }
    }
}