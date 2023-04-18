package ObjectCloning;

import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age , String name){
        this.age = age;
        this.name = name;
        this.arr = new int[] {1,2,3,4};
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Human arnab = new Human(12,"arnab");
        Human bittu = (Human)arnab.clone() ; // shallow copying
        // if it is having an object as a property and if that is modified in the actual one then in the clone it will also get modified
        // as object generally store the ref 

        arnab.age = 111;
        System.out.println(bittu.age);

        Human a1 = new Human(arnab);
        arnab.arr[0] = 100;
        System.out.println(Arrays.toString(a1.arr));

        // deep copy
        // copying elements one by one from arr into another newly created array

    }
}
