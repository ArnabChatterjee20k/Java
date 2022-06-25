import java.util.Scanner;  // Import the Scanner class
class Simple_Interest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter P- ");
        float p = input.nextFloat();
        
        System.out.println("Enter R- ");
        float r = input.nextFloat();
        
        System.out.println("Enter T- ");
        float t = input.nextFloat();

        float SI = p*r*t;
        System.out.println("Simple interest is - "+SI);
    }
}