import java.util.Scanner;  // Import the Scanner class
public class fibonci {
        public static void main(String[] args) {
            // 0 1 1 2 3 5 8 13 ......n
            Scanner input = new Scanner(System.in);

            System.out.println("Enter n` - ");
            int n = input.nextInt();

            int first = 0;
            int second = 1;

            int current_result  = 0; //just declaring the variable. It will be the sum of first and second always

            if (n==1){
                System.out.println(first);
            }
            else if (n==2) {
                System.out.println(first);
                System.out.println(second);
            }
            else {
                System.out.println(first);
                System.out.println(second);
                int count = 2; // first 2 will be always same so count will be starting from 3
                while (count<=n){
                    // fibonci number is the addition of the previous 2 numbers
                    current_result = first + second;
                    first = second;
                    second = current_result;
                    System.out.println(current_result);
                    count++;
                }
            }

    }
}


