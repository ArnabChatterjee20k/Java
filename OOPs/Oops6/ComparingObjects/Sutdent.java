package Oops6.ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Sutdent implements Comparable<Sutdent> {
    int rollno;
    float marks;

    public Sutdent(int roll, float marks) {
        this.rollno = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Sutdent o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{roll= " + this.rollno + ", marks=" + (int) this.marks + "}";
    }

    public static void main(String[] args) {
        Sutdent arnab = new Sutdent(0, 100);
        Sutdent bittu = new Sutdent(1, 2);
        Sutdent a2 = new Sutdent(1, 3);
        Sutdent b2 = new Sutdent(1, 12);

        Sutdent[] list = { arnab, bittu, b2, a2 };
        System.out.println(arnab.compareTo(bittu));

        // the Arrays.sort use the compareTo
        // without this method the object will be giving error
        // And if we implement Comparable then we have to override toCompare
        // our own sorting based on marks
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<Sutdent>() {
            public int compare(Sutdent o1, Sutdent o2) {
                return (int) (o1.rollno - o2.rollno);
            }
        });

        System.out.println(Arrays.toString(list));
    }
}
