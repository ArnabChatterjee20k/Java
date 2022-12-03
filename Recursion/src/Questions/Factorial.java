package Questions;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(4));
    }
    public static int fac(int n){
        // we can say fac(5) as 5*fac(4) so a recursive pattern
        if(n==1) return 1;
        // we know the pointer get back to where it was called.
        // so when f(4) gets resolved 5*f(4) gets called
        return n*fac(n-1);
    }
}
