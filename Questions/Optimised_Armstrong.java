public class Optimised_Armstrong {
    public static void main(String[] args) {
        System.out.println(isArm(153));
    }
    static boolean isArm(int num){
        int ans=0;
        int original = num;
        int rem;
        while (num!=0){
            rem=num%10;
            ans+=rem*rem*rem;
            num = num/10;
        }
        if (ans==original){
            return true;
        }
        return false;
    }
}
