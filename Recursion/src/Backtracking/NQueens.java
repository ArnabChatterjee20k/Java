package Backtracking;

public class NQueens {
    // place n queens on a nxn chessboard such that no queen can cancel each other
    // a queen can move in all direction and diagonally

    // so 2 queens can't be on one row and col

    // we will be placing a first at first row then place the next queen in the
    // next.
    // Then go for the next one. If their is no cell coming fulfilling the condition
    // then backtrack to previous row. Place it again.

    public static void main(String[] args) {
            boolean[][] board = new boolean[8][8];
            int ways = queens(board, 0); 

            System.out.println(ways);
    }

    public static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        
        int count =0 ;
        // placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
                // place the queen if it is safe
                if(isSafe(board,row,col)){
                    board[row][col] = true;
                    count += queens(board, row+1);
                    board[row][col] = false; // backtrack to false
                }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board , int row , int col){
        // check vertical row
        for (int i = 0 ; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // checking diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        
        // checking diagonal right
        int maxRight = Math.min(row, board.length - col -1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;

    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        // System.out.println();
    }
}
