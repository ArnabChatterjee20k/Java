package OOPs4;

public class ObjectClass {
    int num;
    ObjectClass(){
        this.num = 10;
    }
    @Override
    public int hashCode() {
        // hashcode is not address as java does not allow us to get address
        // hashcode is just a random number
        return num ;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass)obj).num; // typecasting then checking
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass();
        ObjectClass obj1 = new ObjectClass();
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj1));
    }
}
