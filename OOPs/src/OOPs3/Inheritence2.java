package OOPs3;

public class Inheritence2 {
    public static void main(String[] args) {
        String surname = "Chatterjee";
        // Child arnab = new Parent("CH");
        Parent arnab = new Child(surname);

        System.out.println(arnab.surname);

        // error as we are trying to access the properties of child
        // but our ref variable is of type parent
        System.out.println(arnab.name);
        System.out.println(arnab.getName());

        // error
        Child bittu = new Parent(surname);

    }
    static class Parent {
        String surname;
    
        Parent(String surname) {
            this.surname = surname;
        }
    }
    
    static class Child extends Parent {
        String name;
    
        Child(String surname) {
            super(surname);
            this.name = "Arnab";
        }
    
        String getName() {
            return this.name + this.surname;
        }
    }
}
