import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // incase of concatenation of 2 char
        System.out.println('a'+'b');// 195=>integer value will be printed
        System.out.println('a'+3);// 100=>integer value
        System.out.println((char)('a'+3));// a+3 => d casting it into char

        // incase of string
        System.out.println("a"+"b"); // ab=> concatenation
        System.out.println("a"+3);// a3
        System.out.println("a" + new int[]{12,2,2});// a[I@76ed5528
        System.out.println("a"+new ArrayList<Integer>(3));//a[]
        
        System.out.println(12+"a" + new int[]{12,2,2}+new int[]{1,2,2,2});

    }
}
