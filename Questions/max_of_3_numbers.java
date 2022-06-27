// 3 methods
import java.util.Scanner;

public class max_of_3_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

//        Method1
//        int max = n1; // assuming n1 to largest
//
//        // using if 2 times as we have to compare 2 times
//        if(n2>max){
//            max=n2;
//        }
//        if (n3>max) {
//            max=n3;
//        }

//        Method2
//        int max=0;
//        if(n1>n2){
//            max=n1;
//        } else {
//            max=n2;
//        }
//        if(n3>max){
//            max=n3;
//        }

//        Method3
        int max = Math.max(Math.max(n1,n2),n3);
        System.out.println(max);
    }

}
