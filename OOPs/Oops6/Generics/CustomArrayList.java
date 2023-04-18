package Oops6.Generics;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // working as index or index pointing to end of the data

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()) resize();
        data[size++] = num;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }
    
    public int size(){
        return size;
    }

    public void set(int index , int num){
        data[index] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        // copying
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{"+Arrays.toString(data)+"}"+" size="+size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(12);
        list.add(5);
        list.add(4);

        list.remove();
        System.out.println(list);
        
    }
}
