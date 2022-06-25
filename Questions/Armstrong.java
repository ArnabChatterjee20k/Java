import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        // 153 = 1^3 + 5^3 + 3^3. So it is armstrong number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int duplicate_num_order = num;
        int duplicate_num_sum = num;

        // order
        int order = 0;
        while (duplicate_num_order!=0){
            duplicate_num_order = duplicate_num_order/10;
            order += 1;
        }

        // individual sum
        int exponent = 3;
        int result = 0;
        while (duplicate_num_sum!=0){
            int current_dig = duplicate_num_sum%10;
            result += Math.pow(current_dig,exponent);
            duplicate_num_sum = duplicate_num_sum/10;
        }
        System.out.println(result==num);
    }
}
