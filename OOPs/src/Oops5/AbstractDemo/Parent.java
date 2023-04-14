package Oops5.AbstractDemo;

public abstract class Parent {
    private static int childs = 0;
    Parent(){
        childs+=1;
        System.out.println("Paarent");
    }
    static void GetChild(){
        System.out.println("Childs = "+Parent.childs);
    }
    
    void getParent(){
        System.out.println("Hello world");
    }
    abstract void career(String name);
}
