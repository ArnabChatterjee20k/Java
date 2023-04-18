import java.util.ArrayList;
import java.util.function.Consumer;

public class Intro {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr ) {
            list.add(i);
        }

        // as for each accepts a Consumer Interface 
        Consumer<Integer> data = (item)-> System.out.println(item*23);;
        list.forEach(data);
        
        list.forEach((item)-> System.out.println(item*10));

        Operation sum = (a,b)->a+b;
        Operation sub = (a,b)->a-b;

        System.out.println(sum.operation(1, 2));


        // using methods to operate
        Intro myCalc = new Intro();
        System.out.println(myCalc.operate(1, 2, sub)); // sub operation
    }

    private int operate(int a , int b , Operation op){
        return op.operation(1, 2);
    }
}

// for performing or using only one method
interface Operation{
    int operation(int a , int b);
}
