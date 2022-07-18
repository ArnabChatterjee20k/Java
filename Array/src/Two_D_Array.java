import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        /*
        * giving number of rows is mandatory and columns not mandatory
        *
        * int[][] arr = new int[3][3];
        * int[][] arr = new int[3][];
        *
        * int[][] arr = {
        *               {1,2,3},
        *               {4,5,6},
        *               {7,8,9}
        *                }
        *
        int[][] two_d_arr = new int[3][3];//[rows][columns]
        *
        * * Size of column can vary
        int[][] n = {
                {1,2,4},
                {12},
                {1,2,5,6}
        };
        */

        // Inputs
        Scanner in = new Scanner(System.in);
        int[][] arr2d = new int[3][2];

        // for every row
        for (int row=0;row<arr2d.length;row++){
            // for every column
            for (int col=0;col<arr2d[row].length;col++){
                arr2d[row][col] = in.nextInt();
            };
        };
        // Printing the array (best way using for each loop)
        // each row will be an array
        for (int[] row: arr2d) {
            System.out.println(Arrays.toString(row));
        };

        //Printing using only row and toString method
        for (int i=0;i< arr2d.length;i++){
            System.out.println(Arrays.toString(arr2d[i]));
        }

        // printing each element
        for (int row=0;row< arr2d.length;row++){
            for(int col=0;col< arr2d[row].length;col++){
                System.out.print(arr2d[row][col]+" ");
            }
            System.out.println(); // to give line break after each row
        }
    }
}
