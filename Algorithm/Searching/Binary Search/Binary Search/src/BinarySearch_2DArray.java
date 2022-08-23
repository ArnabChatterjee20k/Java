import java.util.Arrays;

public class BinarySearch_2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                            {10,20,30,40},
                            {15,25,35,45},
                            {28,29,37,49},
                            {33,34,38,50}
                        };
        // ## Row wise sorted means 10<20<30,.... same for other rows
        // ## Col wise sorted means 10<15<28,.... same for other cols

        int target = -1;
        System.out.println(Arrays.toString(search(matrix, target)));
        };

        static int[] search(int[][] matrix,int target){
            int r = 0;
            int c = matrix.length-1;

            while(r<matrix.length && c>=0){
                if(matrix[r][c] == target){
                    return new int[]{r,c};
                }
                if(matrix[r][c]<target){
                    r++;
                }
                else{
                    c--;
                }
            }
            return new int[]{-1,-1}; // if element not exists
        }
    }