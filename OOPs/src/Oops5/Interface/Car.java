package Oops5.Interface;

public class Car implements Engine,Brake,Media{
    @Override
    public void start(){
        System.out.println("Car starts");
    };
    @Override
    public void stop(){
        System.out.println("Car stops");
    };
    @Override
    public void acc(){
        System.out.println("Car acc");
    };

    @Override
    public void brake(){
        System.out.println("Car brake");
    };

    @Override
    public void identifier(){
        System.out.println("I am car");
    }

    public static void main(String[] args) {
        Engine vimo = new Car();
        vimo.start();
        vimo.stop();
        vimo.acc();
        vimo.identifier();
        
        
    }
}
