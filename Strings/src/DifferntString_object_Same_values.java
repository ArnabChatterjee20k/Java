public class DifferntString_object_Same_values {
    public static void main(String[] args) {
        String a = new String("arnab");
        String b = new String("arnab");

        System.out.println(a==b);

        System.out.println(a.equals(b));
    }
}
