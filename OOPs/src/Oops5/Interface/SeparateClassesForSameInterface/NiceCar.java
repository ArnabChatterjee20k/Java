package Oops5.Interface.SeparateClassesForSameInterface;


import Oops5.Interface.Engine;
import Oops5.Interface.Media;

public class NiceCar {
    // here we are assigning the reference as the interfaces
    // now we can create objects by assigning class easily
    private Engine engine;
    private Media player = new CDPlayer();

    // Defining all the constructors
    public NiceCar(){
        engine = new PowerEngine();
    }
    
    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

    public void start(){
        // Now if the the engine is started according to electric and power engine
        engine.start();
    }

    public void startMusic(){
        player.start();
    }

    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        // internally both are running start but no clash
        car.start();
        car.startMusic();
        
        car.upgradeEngine();
        car.start();
    }

}
