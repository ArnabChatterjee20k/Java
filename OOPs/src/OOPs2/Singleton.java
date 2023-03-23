package OOPs2;

public class Singleton{
    public static void main(String[] args) {
        SingletonClass a = SingletonClass.getInstance();
        SingletonClass b = SingletonClass.getInstance();
        SingletonClass c = SingletonClass.getInstance();
        
        // all are having same object
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
class SingletonClass {
        // SingleTon class means only creation of one object is allowed
        private SingletonClass(){}       
        private static SingletonClass instance;

        // method returing the SingletonClass Object
        public static SingletonClass getInstance(){
            // check whether 1 obj only is created or not
            if(instance == null){
                instance = new SingletonClass(); // calling the constructor
            } 

            return instance;
        }
}
