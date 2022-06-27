// more easier approach than in the questions reverse integer
public class reverse_integer_2 {
    public static void main(String[] args) {
        /*
        * 2345 = 2000 + 300 + 40 + 5
        * ans = 0
        * ans =  0+5 = 5
        * ans =  5*10 + 4 = 54 or ans*10+rem
        * ans =  54*10+3 = 543
        * ans =  543*10+2 = 5432
        * */

        int n = 2345;
        int ans = 0;
        while (n>0){
            int rem = n%10;
            n/=10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}