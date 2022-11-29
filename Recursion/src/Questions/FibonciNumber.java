package Questions;

public class FibonciNumber {
    public static void main(String[] args) {
        // 0 1 2 3 5 8 13 ....
        System.out.println(print(4));
    }

    static int print(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        return print(n-1)+print(n-2);
    }
}
