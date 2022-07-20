import java.util.ArrayList;
public class Multidimension {
    public static void main(String[] args) {
        // We want an arraylist of arraylists of integer. So the dataype is arraylist.
        // But by default the references inside the list is null.
        // SO we need to add arraylist object first.
        ArrayList<ArrayList<Integer>> list_2d = new ArrayList<>();

        // initialisation part
        // by default the references inside list is null
        for(int row = 0;row<3;row++){
            list_2d.add(new ArrayList<>()); // adding individual lists to list
        }
        
        // adding data to the rows using foreach
        list_2d.forEach((num)-> num.add(12));
        
        // Printing Directly using sout
        System.out.println(list_2d);

        // printing using for loop
        for (int i = 0; i < list_2d.size(); i++) {
            System.out.println(list_2d.get(i));
        }
    }
}
