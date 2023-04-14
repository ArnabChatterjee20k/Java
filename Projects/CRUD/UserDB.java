package Projects.CRUD;

import java.util.Arrays;

public class UserDB implements Operation{
    private String[] data ;
    
    UserDB(){
        this.data = new String[10];
    }

    @Override
    public void create(){
        this.data[this.data.length-1] = "User";
    };

    @Override
    public void read(){
        System.out.println(Arrays.toString(this.data));
    };
}