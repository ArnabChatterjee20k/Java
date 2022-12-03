package Questions;

public class NaturalSum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
        // sum(5) = 5+sum(4)
        if(n==1) return 1;
        return n+sum(n-1);
    }
}
