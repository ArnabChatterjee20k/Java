import LambdaExpression.*;

public class Sorting  {
    int rollno;
    float marks;

    public Sorting(int roll, float marks) {
        this.rollno = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{roll= " + this.rollno + ", marks=" + (int) this.marks + "}";
    }

    public static void main(String[] args) {
        Sorting arnab = new Sorting(0, 100);
        Sorting bittu = new Sorting(1, 2);
        Sorting a2 = new Sorting(1, 3);
        Sorting b2 = new Sorting(-1, 12);

        Sorting[] list = { arnab, bittu, b2, a2 };
        
        Arrays.sort(list,((o1, o2) -> (int)(o1.rollno - o2.rollno)));
        System.out.println(Arrays.toString(list));
    }
}
