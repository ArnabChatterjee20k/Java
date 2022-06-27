//cleaner code than the fibonci code present
// in the questions folder
import java.util.Scanner;

public class fibonci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while(count<=n){
            int temp = i;
            i+=p;
            p=temp;
            count++;
        }
        System.out.println(i);
    }
}
