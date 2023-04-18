package Exception_Handling;

public class Divison {
    public static void main(String[] args) {
        divide(1, 0);
        // System.out.println(divide(1, 1));
    }
    static int divide(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please donot divide by zero");
        }
        return a/b;
    }
}
