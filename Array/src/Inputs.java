import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // Input using loops
        int roll[] = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i=0;i<roll.length;i++){
            roll[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(roll));
    }
}
