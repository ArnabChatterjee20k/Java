import java.util.Arrays;

public class Variable_Length_Arguments {
    public static void main(String[] args) {
        fun(2,3,4,5,6,76);
        fun(); // empty array
        fun2(1,2,"a","b","v");
    }
    static void fun(int ...v){
        // interally int ...v this stores an array of integer
        System.out.println(v); // showing memory location
        System.out.println(Arrays.toString(v)); // getting the integers
    }
    static void fun2(int a , int b , String ...v){
        // combination of different araguments
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
