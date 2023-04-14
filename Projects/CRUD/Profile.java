package Projects.CRUD;

import java.util.Arrays;

public class Profile implements Operation{
    private String[] data ;

    Profile(){
        this.data = new String[10];
    }

    @Override
    public void create(){
        this.data[this.data.length-1] = "Profile";
    };

    @Override
    public void read(){
        System.out.println(Arrays.toString(this.data));
    };
}