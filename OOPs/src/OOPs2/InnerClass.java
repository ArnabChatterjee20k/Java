package OOPs2;
public class InnerClass{
    static class Test{
        String name;
        Test(){
            this.name = "ARnab";
        }
    }
    public static void main(String[] args) {
        // Test a = new Test(); errro cant be accessed as we cant use non static inside static method
        // so make Test class as static

        Test a = new Test();
        System.out.println(a);
    }
}