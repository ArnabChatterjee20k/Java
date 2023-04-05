package Inheritence;

public class UsingSuper {
    public static void main(String[] args) {
        Child arnab = new Child();
        System.out.println(arnab.h);
    }

    static class Parent{
        int l,b;
        Parent(){
            this.l = 12;
            this.b = 11;
        }
    }
    
    static class Child extends Parent {
        int h;
        Child(){
            super();
            this.h = super.l+super.b; // using super to target parent properties
        }
    }
}
