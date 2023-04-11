package AccessModifiers.Protected.Class2;

import AccessModifiers.Protected.Class1.Class1;;

public class Class2 extends Class1{
    Class2(){
        super();
        System.out.println(this.data);
    }

    public static void main(String[] args) {
        Class2 c = new Class2();
        Class3 newC = new Class3(); // gonna print 2 times 12 as class3 calling contructor of class2
    }

    static class Class3 extends Class2{
        Class3(){
            super();
            System.out.println(this.data); 
        }
    }
}
