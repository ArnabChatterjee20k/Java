import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        };

        // getting item(we cant use list[])
        System.out.println(list.get(10));

        // size and contain
        System.out.println(list.contains(10));
        System.out.println(list.size());

        // updating 0th index data to 100
        list.set(0, 100);
        
        // removing data at particular indices
        list.remove(1);
        System.out.println(list);
    }
}
