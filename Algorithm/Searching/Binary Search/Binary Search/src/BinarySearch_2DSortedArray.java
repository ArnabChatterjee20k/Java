import java.util.Arrays;

public class BinarySearch_2DSortedArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 4;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] binarySearch(int[][] matrix , int row , int colStart , int colEnd , int target){
        /** search in the row provided between the cols provided */
        while(colStart<=colEnd){
            int mid = colStart+(colEnd-colStart)/2;
            if(matrix[row][mid]==target){
                return new int[] {row,mid};
            }
            if(target>matrix[row][mid]){
                colStart = mid+1;
            }
            else{
                colEnd = mid-1;
            }
        }
        return new int[] {-1,-1};
    }
    
    static int[] search(int[][] matrix ,int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious,matrix can be empty

        if(rows==1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int midCol = cols/2;
        // run the loops untill 2 rows are remaining
        while(rStart<(rEnd-1)){
            // more than 2 rows
            int mid = rStart+(rEnd-rStart)/2;
            if(matrix[mid][midCol]==target){
                return new int[]{mid,midCol};
            }
            if(target>matrix[mid][midCol]){
                // ignore the above rows
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }

        // now we have 2 rows
        // check whether the target is in the col of the 2 rows
        
        // checking for first
        if(matrix[rStart][midCol]==target){
            return new int[]{rStart,midCol};
        }
        // rEnd will rStart+1
        if(matrix[rStart+1][midCol]==target){
            return new int[]{rStart+1,midCol};
        }
        // search in 1st half ,2nd half ,3rd half,4th half
        else{
            // 1st half
            if(target<=matrix[rStart][midCol-1]){
                return binarySearch(matrix, rStart, 0, midCol-1, target);
            }
            // 2nd half
            if(target>=matrix[rStart][midCol+1] && target<=matrix[rStart][cols-1]){
                return binarySearch(matrix, rStart, midCol+1 , cols-1, target);
            }
            // 3rd half
            if(target<=matrix[rStart+1][midCol-1]){
                return binarySearch(matrix, rStart+1, 0, midCol-1, target);
            }
            // 4th half
            else{
                return binarySearch(matrix, rStart+1, midCol+1, cols-1, target);
            }

        }
    }
}
