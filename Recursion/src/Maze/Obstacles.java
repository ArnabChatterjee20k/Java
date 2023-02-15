package Maze;

public class Obstacles {
    public static void main(String[] args) {
        // now suppose you have a river in any cell example (1,1)
        // When you land on a cell , check whether you land on river or not
        // if it is river return
        // here we will be starting from 0 , 0
        boolean[][] maze = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        int initialRow = 0;
        int initialCol = 0;
        print("", maze, initialRow, initialCol);
    }

    public static void print(String p,boolean[][] maze , int row , int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[row][col]==false){
            return;
        }

        if(row<maze.length-1){
            print(p+"D",maze, row+1, col);
        }

        if(col<maze[0].length-1){
            print(p+"R",maze, row, col+1);
        }
    }
}