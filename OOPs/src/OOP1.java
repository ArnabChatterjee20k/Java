import java.util.Arrays;

public class OOP1 {
    public static void main(String[] args) {
        // store 5 rolls
        int[] num = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students 
        // instead of declaring them in separate variables we need one student object
        
        // Student s1; // declaring the reference to the object but not creating an object. It is just present in the stack memory

        // creating an array of student -> datatype[] variable = new datatype[size]
        Student[] students = new Student[5]; // all nulls
        System.out.println(Arrays.toString(students));

        // creating object or intitialise it using new
        Student s1 = new Student();

        Student s2 = new Student("arnabs",12,122);
        
        Student s3 = new Student(s2);
        System.out.println(s3.name);
        System.out.println(s3.roll);

        // final 
        final int BONUS = 2;
        // BONUS+2;
        

    }
}
// create a class for every single student
class Student{
    // declaring instance variables. By default they will have their default values
    String name;
    int roll;
    int grade;
    
    Student(){
        this("ss",12,12); // calling constructor inside a constructor
    }
    // constructor with parameters (constructor overloading)
    Student(String name,int roll,int marks){
        this.name = name;// here name is used in param and also in instance variable. So using this
        this.roll = roll;
        grade = marks; // here we can skip this as well. Internally it will be this.grade only
    }

    // taking name and roll from other Student
    Student(Student otherStudent){
        this.name = otherStudent.name+"->takeen from other_student";
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}
