package Oops6.Generics;
import java.util.Arrays;;
public class ProperCustomArrayList<T> {
    private Object[] data; // if we see the internal implementation of ArrayList then also we can see that they are using object
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // working as index or index pointing to end of the data

    public ProperCustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()) resize();
        data[size++] = num;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        // removed is of type T but previously we were giving Object type. Now are type casting to T
        
        // Object is of higher level. T is of smaller level. We cant store higher(Object) in lower(T)
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }
    
    public int size(){
        return size;
    }

    public void set(int index , T num){
        data[index] = num;
        // no casting required as T(lower level) getting stored in data[index] that is higher level(Object)
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];
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
        ProperCustomArrayList<Integer> list = new ProperCustomArrayList<>();
        list.add(12);   
        
        ProperCustomArrayList<String> list1 = new ProperCustomArrayList<>();
        list1.add("arnab");   

        System.out.println(list);
        System.out.println(list1);
    }
}
