package Exception_Handling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a/b; // checked exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program completed");
        }
    }
}
