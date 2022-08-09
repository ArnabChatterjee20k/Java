package two_d_array;

import java.util.Arrays;

public class Search_2d_Array {
    public static void main(String[] args) {
        int[][] arr = {
                        {1,2,3,5},
                        {22,11,31,52},
                        {100,12,112,18}
                    };
        int target = 2;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    // we will be returning array of row and col
    static int[] search(int[][] arr , int target){
        int[] ans= {-1,-1};
        // row
        for(int row=0 ; row<arr.length ; row++){
            //col
            for(int col=0 ; col<arr[row].length ; col++){
                if(arr[row][col]==target){
                    ans[0] = row;
                    ans[1] = col;
                    return ans;
                }
            }
        }
        return ans;
    }
}
