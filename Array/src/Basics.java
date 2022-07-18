import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // datatype[] variable_name = {}

        // int array
        int[] i_arr = new int[5];
        System.out.println(Arrays.toString(i_arr)); // [0, 0, 0, 0, 0]
        System.out.println(i_arr[0]);

        int[] i_arr1 = {};
        System.out.println(Arrays.toString(i_arr1)); // []
        // System.out.println(i_arr1[0]); error


        // String array
        String[] s_arr = new String[5];
        System.out.println(Arrays.toString(s_arr));// [null, null, null, null, null]
        System.out.println(s_arr[0]);


        // float array
        float[] f_arr = new float[5];
        System.out.println(Arrays.toString(f_arr)); // [0.0, 0.0, 0.0, 0.0, 0.0]
        System.out.println(f_arr[0]);

        // char array
        char[] c_arr = new char[5];
        System.out.println(Arrays.toString(c_arr)); //[ ,  ,  ,  ,  ] // this is basically /u0000
                                                    // which is null in unicode
    }
}
