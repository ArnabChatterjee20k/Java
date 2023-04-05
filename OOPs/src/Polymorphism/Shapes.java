package Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am an area");
    }
    // early binding
    final void name(){
        // Cant be overriden
        System.out.println("I am shape name");
    }
}
