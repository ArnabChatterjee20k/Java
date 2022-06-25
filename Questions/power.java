public class power {
    public static void main(String[] args) {
        int base = 10;
        int base_multiplier = 10;
        int exponent = 3;
        // we have already 10 so to get the exponent of 3 we need to multiply 10 2times with base
        for(int i=0;i<exponent-1;i++){
            base *= base_multiplier;
        }
        System.out.println(base);
    }
}
