package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        shape.area();
        circle.area();

        Shapes newCircle = new Circle();
        newCircle.area();

        // we cant override a method that is final
    }
}
