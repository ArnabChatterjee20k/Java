package Backtracking;

public class Backtrack {
    public static void main(String[] args) {
        // traverse the whole maze and print the path
        // you can move in up, right,down,left
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        int initialRow = 0;
        int initialCol = 0;
        printAllPath("", maze, initialRow, initialCol);
    }

    public static void printAllPath(String p, boolean[][] maze, int row, int col) {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[row][col] == false) {
            return;
        }

        // Marking the visited path as false
        maze[row][col] = false;

        if (row < maze.length - 1) {
            printAllPath(p + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            printAllPath(p + "R", maze, row, col + 1);
        }

        if (row > 0) {
            printAllPath(p + "U", maze, row - 1, col);
        }

        if (col > 0) {
            printAllPath(p + "L", maze, row, col - 1);
        }

        // this line will execute when the functions get poped out
        // so reverting the changes made by the calls
        maze[row][col] = true;

    }
}
