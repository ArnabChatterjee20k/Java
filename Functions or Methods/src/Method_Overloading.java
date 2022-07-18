public class Method_Overloading {
    public static void main(String[] args) {
        func(1);
        func("arnb");
    }

    static void func(int a ){
        System.out.println(a);
    }
    static void func(String name){
        System.out.println(name);
    }


}
