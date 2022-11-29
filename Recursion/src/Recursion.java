public class Recursion {
    public static void main(String[] args) {
        // print 1 to 5 with recursion
        print(1);
    }
    static void print(int n){
        // base condition
        /**
         * we can also do this
         * if(n==5){
            System.out.println(5);
            return;
            }
         */
        if(n>5){
            return ;
        }
        // body
        System.out.println(n);
        
        //recursive calls
        print(n+1);
    }
}