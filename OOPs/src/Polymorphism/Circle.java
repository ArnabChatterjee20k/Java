package Polymorphism;

public class Circle extends Shapes{
    // late binding
    @Override   
    void area() {
        System.out.println("I am an area of circle");
    }
}
