package Maze;

public class AllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        int initialRow = 0;
        int initialCol = 0;
        print("", maze, initialRow, initialCol);
    }

    public static void print(String p, boolean[][] maze, int row, int col) {

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
            print(p + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            print(p + "R", maze, row, col + 1);
        }

        if (row > 0) {
            print(p + "U", maze, row - 1, col);
        }

        if (col > 0) {
            print(p + "L", maze, row, col - 1);
        }

        // this line will execute when the functions get poped out
        // so reverting the changes made by the calls
        maze[row][col] = true;

    }
}