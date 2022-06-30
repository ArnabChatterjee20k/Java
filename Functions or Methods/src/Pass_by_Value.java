public class Pass_by_Value {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a , b);
        System.out.println(a+" "+b); // we will see the values are not swapped.
        /*
        * Actually when are passing the objects a and b in swap they are not passed but their
        * value is passed.
        * Now n1 and n2 are the reference variable
        * which are copy of a and b respectively.
        * So both reference variable n1 and a points
        * the same object.
        *
        * So at first a and n1 pointing to same object
        * But after that n1 started pointing to n2
        * which will not affect the pointing of a.
        * a still will point to 10
        * */
    }
    static void swap(int n1 , int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}