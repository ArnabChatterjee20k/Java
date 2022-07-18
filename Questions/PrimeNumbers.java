public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i=2;i<100;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int number){
//        boolean prime = true;
        for (int i=2;i<=number/2;i++){
            if(number%i==0){
//                prime=false;
                return false;
            }
        }
//        return prime;
        return true;
    }
}
