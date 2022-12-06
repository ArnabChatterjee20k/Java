package Questions;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(32010, 0));
    }
    // here the value will be returned to above calls
    public static int count(int n,int counter) {
        if(n==0) return counter;
        if(n%10==0) return count(n/10,counter+1);
        return count(n/10,counter);
    }
}