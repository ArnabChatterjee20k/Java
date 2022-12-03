package Questions;

public class Print {
    public static void main(String[] args) {
        print1_n(5,1);
        
        System.out.println();
        printn_1(5);
        
        System.out.println();
        print1_n2(5);
    }

    public static void printn_1(int n){
        if(n==1) {
            System.out.println(1);
            return;
        }
        // printing n before f(n) is inserted in the stack
        System.out.println(n);
        printn_1(n-1);
    }

    public static void print1_n(int n,int cur){
        if(cur>n) return;
        System.out.println(cur);
        print1_n(n, ++cur);
    }

    public static void print1_n2(int n){
        // printing the n after f(n) poped from stack
        if(n==0) {
            return;
        }
        // f(3) will call f(2) will call f(1) will call f(0) return void
        // then f(1) gets poped and in f(1) n is 1 so sout(n) is 1
        // actually in this method after the f(0) returned void all calls are getting poped here and after poping the compiler encounters the sout(n) part
        print1_n2(n-1);
        System.out.println(n);
    }
}
