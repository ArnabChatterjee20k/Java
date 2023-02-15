package Backtracking;

import java.util.Arrays;

public class PrintPathMatrix {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        int initialRow = 0;
        int initialCol = 0;
        int[][] path = new int[maze.length][maze[0].length];
        print("", maze, initialRow, initialCol,path,1);
    }
    
    public static void print(String p, boolean[][] maze, int row, int col ,int[][]path, int step) {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step; // this also adds to the last step
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));   
            }
            System.out.println(p);
            
            System.out.println();
            return;
        }

        if (maze[row][col] == false) {
            return;
        }

        // Marking the visited path as false
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            print(p + "D", maze, row + 1, col,path,step+1);
        }

        if (col < maze[0].length - 1) {
            print(p + "R", maze, row, col + 1,path,step+1);
        }

        if (row > 0) {
            print(p + "U", maze, row - 1, col,path,step+1);
        }

        if (col > 0) {
            print(p + "L", maze, row, col - 1,path,step+1);
        }

        // this line will execute when the functions get poped out
        // so reverting the changes made by the calls
        maze[row][col] = true;
        path[row][col] = 0;

    }
}