public class counting_occurances_of_a_number {
    public static void main(String[] args) {
        int n = 1385757879;
        int digit = 7;
        int repeatation_digit = 0;

        while(n>0){
            int rem = n%10;
            if(rem==digit){
                repeatation_digit++;
            }
            n/=10;
        }
        System.out.println(repeatation_digit);
    }
}