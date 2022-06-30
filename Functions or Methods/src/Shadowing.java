public class Shadowing {
    static int x=10; // this x is shadowed
    public static void main(String[] args) {
        System.out.println(x); // static x
        int x=100;
        {
            // x can be accessed here in this block as well
            // but this x will be of method
            System.out.println(x);
        }
        fun();// static x //10
    }
    static void fun(){
        System.out.println(x);
    }
}