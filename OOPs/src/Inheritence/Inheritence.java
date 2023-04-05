package Inheritence;

public class Inheritence {
    public static void main(String[] args) {

        // referncing child to a child
        // Child rectangle = new Child(1, 2, 3,12);
        // System.out.println();
        
        // referencing child to a parent
        Parent b = new Child(0, 0, 0, 0); // here we can access properties of parent not child
        
        // error as we cant refer parent to a child.
        // Child a = new Parent(0, 0, 0); // here we can access properties of child not parent
        
        // left side is reference varibale
        // right side type of object.

        // left side determines what values are gonna get accessed
        // SUPERCLASS ref = new SUBCLASS();    // HERE ref can only access methods which are available in SUPERCLASS
    }
}

class Parent{
    int length;
    int breadth;
    private int data;
    Parent(int l , int b,int meta){
        this.length = l;
        this.breadth = b;
        this.data = meta;
        // System.out.println(this.data); // we can acccess it here as data is private and we are calling in the parent only
    }
}

class Child extends Parent{
    int height;
    Child(int l,int b,int h,int data){
        // we are able to initialise the data attribute as child is not initialising it
        // rather the super which is calling the constructor of parent is initialisng it
        super(l, b,data); // used to initialise values to parent class constructor
        this.height = h;
        // System.out.println(this.data); // we cant acccess it here as data is private
        
    }
    
    public int sum() {
        return this.length+this.breadth+this.height;
    }
}