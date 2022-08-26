public class NegativeNum {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
        // searching for the first negative number
        // if it is at index at 3 that means  all elements in that column after that element will be negative.
        // So That means index 3 element of last row will be also negative
        // Our last col is having 4 elements so all 4 will be negative.
        // Better to say Matrix_length-Current_Row will give the number of elements in that column
        // Then move to previous column
        // If current element is not negative that previous all elements of that element will not be negative as descending order
        // Move to next row
        
        int row = 0;
        int col = grid[0].length-1;
        
        int gridLength = grid.length;
        
        int count = 0;
        while(row<gridLength && col>=0){
            int currentElement = grid[row][col];
            if(currentElement<0){
                count+=gridLength-row; // adding all negative elements in that column
                col--;// if negative moving to previous column
            }
            else{
                row++; // if not negative moving to next column
            }
        }
        return count;
    }
}
