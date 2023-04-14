package Oops5.Interface.SeparateClassesForSameInterface;
import Oops5.Interface.*;
public class ElectricEngine implements Engine {
    @Override
    public void start(){
        System.out.println("ElectricEngine starts");
    };
    @Override
    public void stop(){
        System.out.println("ElectricEngine stops");
    };
    @Override
    public void acc(){
        System.out.println("ElectricEngine acc");
    };


}
