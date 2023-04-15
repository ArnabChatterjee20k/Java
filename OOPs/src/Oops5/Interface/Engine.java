package Oops5.Interface;

public interface Engine {
    int PRICE = 76800; // by default static and final

    default void identifier(){
        System.out.println("I am an engine interface");
    }
    // by default public and abstract
    void start();
    void stop();
    void acc();
}
