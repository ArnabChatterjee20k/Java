// same code as BinarySearch_2DSortedArray.java
// Here edge cases are also addressed
public class SortedMatrix{
    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix = {{-10,-10},{-9,-9},{-8,-6},{-4,-2},{0,1},{3,3},{5,5},{6,8}};
        int target = 0;
        System.out.println(searchMatrix(matrix, target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return binarySearch(matrix[0],target,0,cols-1);
        }
        
        // applying conditioned binary search if we get element return true else continue the loop till 2 rows are remaining
        int rowStart = 0;
        int rowEnd = rows-1;
        
        int colMid = cols/2;
        
        while(rowStart<rowEnd-1){
            // loop will continue untill we will be having 2 rows left
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            if(matrix[rowMid][colMid]==target){
                return true;
            }
            else if(target>matrix[rowMid][colMid]){
                rowStart = rowMid;
            }
            else{
                rowEnd = rowMid;
            }
        }
        // System.out.println(rowStart+" "+rowEnd);
        
        // 2 rows left
        // searching in the middle column
        if(matrix[rowStart][colMid]==target){
            return true;
        }
        if(rowStart+1<rows && matrix[rowStart+1][colMid]==target){
            return true;
        }
        
        // else searching in the other parts
        if(colMid>0 && matrix[rowStart][colMid-1]>=target){
            return binarySearch(matrix[rowStart],target,0,colMid-1);
        }
                            
        if(colMid+1<cols && matrix[rowStart][colMid+1]<=target && matrix[rowStart][cols-1]>=target){
            return binarySearch(matrix[rowStart],target,colMid+1,cols-1);
        }
                            
        if(colMid>0 && matrix[rowStart+1][colMid-1]>=target){
            return binarySearch(matrix[rowStart+1],target,0,colMid-1);
        }
        else{
            if(colMid+1<cols && rowStart+1<rows){
                return binarySearch(matrix[rowStart+1],target,colMid+1,cols-1);
            }
            else{
                return binarySearch(matrix[rowStart],target,colMid,cols-1);
            }
        }
                            
                            
    }
    static boolean binarySearch(int[] arr,int target , int start , int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}