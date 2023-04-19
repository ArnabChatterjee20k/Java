package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Intro {
    
    public static void main(String[] args) {
        // List interface
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        list.add(12);
        linkedlist.add(12);
        vector.add(12);

        System.out.println(list);
        System.out.println(linkedlist);
        System.out.println(vector);
    }
}
