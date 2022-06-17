public class TypeCasting {
    public static void main(String[] args) {
        // Type casting is manual conversion of data type
        // here we can do convert to incompatible types
        /*
            1) Implicit Type casting or Widening Casting(Automatically)
            2) Explicit Type Casting or Narrowing Casting (manually)
         */

        // explicit
        int num = (int)(12.12f);
        System.out.println(num);

        // impilicit
        int a = 257;
        byte b = (byte)(a); // max value of byte is 256
        System.out.println(b); // 257 % 256
        // it will give the remainder of 257 divided by 256

        // Automatic type promotion
        byte a1 = 40;
        byte b1 = 50;
        byte c1 = 100;
        int d = a1*b1 / c1;
        System.out.println(d);
        /*
            40*50 is 2000 which exceeds max value
            of byte which 256 so java automatically
            promoting each byte to int while evaluating
            the expression. This is called automatic type promotes
         */

        byte b3 = 42;
        char c3 = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.6f;
        double d2 = 0.1234;
        double result = (f*b3) + (i/c3) - (d2*s);

        System.out.println((f*b3) + " " + (i/c3) + " " + (d2*s));
        System.out.println(result);
        // float + int - double = double


    }
}