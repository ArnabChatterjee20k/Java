public class Methods {
    public static void main(String[] args) {
        System.out.println(sum2());
        int ans = sum2();// since the sum2 returning int so we can store it in int
        System.out.println(ans);
        System.out.println(greet());
        System.out.println(sum_arguments(1,2));
    }
    /*
     * accesss_modifier return_type name_of_function(arguments){
     *       //body
     *       // return statement;
     * }
     *
     * // Or Simply
     *
     * return_type name_of_function(arguments){
     *   //body
     *   return statement;
     * }
     * */
        static void sum(){
            System.out.println(1+1);
        }
        // return the value
        static int sum2(){
            return 1+1;
        }
        static String greet(){
            return "Hellow world";
        }

        // arguments
        static int sum_arguments(int a , int b){
            return a+b;
        }
}