package Oops5.AbstractDemo;

public class Child extends Parent{
    Child(){
        super();
    }
    @Override
    void career(String name) {
        System.out.println("Developer"); 
    }

    public static void main(String[] args) {
        Child arnab = new Child();
        arnab.career(null);
        Parent.GetChild();
        
        Child bittu = new Child();
        Parent.GetChild();

        bittu.getParent();

        Parent son = new Child();
        son.career(null);
    }
}