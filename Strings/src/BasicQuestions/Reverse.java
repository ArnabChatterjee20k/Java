import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String to be reversed ");
        String str = scan.nextLine();
        scan.close();
        System.out.println(reverse(str));
    }
    static String reverse(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(arr);
    }
}
