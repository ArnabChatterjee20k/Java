package Oops6.Generics;

public class WildCard<T extends Number> {
    public static void main(String[] args) {
        // WildCard<String>; error as We are using String
        WildCard<Integer> data;
    }
}
