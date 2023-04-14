package Projects.CRUD;

import java.util.Arrays;

public class ItemDB implements Operation{
    private String[] data ;

    ItemDB(){
        this.data = new String[10];
    }

    @Override
    public void create(){
        this.data[this.data.length-1] = "Item";
    };

    @Override
    public void read(){
        System.out.println(Arrays.toString(this.data));
    };
}
