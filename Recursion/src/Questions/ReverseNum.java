package Questions;

public class ReverseNum {
    static int sum = 0 ;
    public static void main(String[] args) {
        rev1(122245);
        System.out.println(sum);

        System.out.println(rev2(12345678, 0));

        System.out.println(rev3(12345));
    }
    // using global sum
    public static void rev1(int n) {
        if(n==0) return ;
        int rem = n%10;
        // manipulating the static global sum
        sum = sum*10+rem;
        rev1(n/10);
    }

    // using pure recursion and argumens in the function
    public static int rev2(int n,int curSum){
        
        if(n==0) return curSum;
        int rem = n%10;
        curSum = curSum*10 + rem;
        return rev2(n/10, curSum);
    }
    
    // using helper function
    public static int rev3(int n) {
        int digits = (int)(Math.log10(n))+1;
        return helper(n, digits);
    }
    public static int helper(int n,int digits) {
        // if the number is single digit return the number
        if(n%10==n) return n;
        int rem = n%10;
        return rem*(int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
}
