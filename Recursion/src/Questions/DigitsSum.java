package Questions;

public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(sum(121));
    }
    public static int sum(int num){
        // sum(123) = 3 + sum(12)
        // sum(123) = 123%10 + sum(123/10)
        if(num==0) return 0;
        return num%10+sum(num/10);
    }
}
