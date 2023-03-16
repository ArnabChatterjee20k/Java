public class Object_Finalise {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            Student a = new Student();
        }       
    }
}

class Student{
    Student(){
        // System.out.println(this);
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}
