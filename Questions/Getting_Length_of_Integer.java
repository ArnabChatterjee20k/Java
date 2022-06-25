import java.util.Scanner;

public class Getting_Length_of_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        *  By doing integer_division integer with 10  continuosly with 10 untill 0 remainder comes
        * we can get the order or length of the integer
        * */

        System.out.println("Enter integer - ");
        int num = input.nextInt(); // since num is int so if it becomes float then also  int will be taken
        int length_of_num = 0;
        if (num==0){
            System.out.println("length is 1");
        }
        else {
            while (num!=0){
                num = num / 10;
//                System.out.println(num);
                length_of_num++;
            }
        }

        System.out.println("Length of num is - "+length_of_num);
    }
}
