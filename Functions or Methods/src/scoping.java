public class scoping {
    public static void main(String[] args) {
        int a = 10;
        {
            // int a = 19; error as outside the block in same method the a is initialised
            int b=10;
            a=100;// reassigning the new value to already created a.
            // b is in this block in  so it cant be accessed outside the block
        }

        for (int i=0;i<5;i++){
            //loop scope

            // we cant create variables that are initialised in the same method
            // num cant be accessed outside the loop
            int num = 4;
        }
    }
    static  void random(int marks){
        // method scope
        // We can access num and arguments in this method only
        int num = 67;
        System.out.println(num);
    }
}