package Projects.CRUD;
public class Main{
    private Operation curPointer;
    
    Main(){
        // default points to user
        curPointer = new UserDB();
    }
    
    
    Main(ItemDB item){
        // default points to user
        curPointer = item;
    }

    public void upgradeUserToProfile(){
        this.curPointer = new Profile();
    }
    
    public void changeToItem(){
        this.curPointer = new ItemDB();
    }
    
    public void create(){
        this.curPointer.create();
    }
    
    public void read(){
        this.curPointer.read();
    }


    public static void main(String[] args) {
        // Operation user = new UserDB();
        // user.create();
        // user.read();
        Main element = new Main();
        element.create();
        element.read();
        
        element.upgradeUserToProfile();
        element.create();
        element.read();
        
        element.changeToItem();
        element.create();
        element.read();
    }
}