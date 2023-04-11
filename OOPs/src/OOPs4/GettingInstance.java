package OOPs4;

public class GettingInstance {
    public static void main(String[] args) {
        GettingInstance a = new GettingInstance();
        System.out.println(a instanceof GettingInstance);
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());
    }
}
