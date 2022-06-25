import java.util.Scanner;

public class Pallindrome_Int {
    public static void main(String[] args) {
        /* Algo
         * 1) order
         * 2) Get last digit using modulo
         * 3) Join them (1234 can be written as 1000+200+30+1)
         * */

        // input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer - ");
        int num = input.nextInt(); // since num is int so if it becomes float then also  int will be taken
        int duplicate_num  = num;
        int duplicate_num2  = num;
        // order
        int length_of_num = 0;
        if (num==0){
            length_of_num = 0;
        }
        else {
            while (num!=0){
                num = num / 10;
                length_of_num++;
            }
        }

        // getting the last digit and joining them
        int digit_traversed = 0;
        int reversed_num = 0;

        while (digit_traversed<=length_of_num){

            // arranging the 10s value
            int tens = 10;
            int tens_base_multiplier = 10;
            int exponent = length_of_num - digit_traversed -1; // if the current digit is in 1000 position we need 3 zeros rather if n is the length of the total number then its digits number zeroes is their postion - 1
            for (int i=1;i<exponent;i++){
                tens *= tens_base_multiplier;
            }

            int current_digit = duplicate_num%10;
            duplicate_num = duplicate_num/10;
            if (length_of_num-digit_traversed>1){
                reversed_num+=current_digit*tens;
            }
            else {
                reversed_num += current_digit;
            }
            digit_traversed++;
        }
        System.out.println(reversed_num);
        System.out.println(reversed_num==duplicate_num2);
    }
}
