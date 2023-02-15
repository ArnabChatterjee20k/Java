package Maze;

public class Count {
    public static void main(String[] args) {
        // suppose you have a 2d array of 3 rows and 3cols
        // number of ways to reach index (2,2) and we can either go rigth and down
        // So return the number of ways
        System.out.println(count(3, 3));
    }   

    static int count(int row ,int col){
        if(row==1 || col==1){
            return 1;
        }

        int down = count(row-1, col);
        int right = count(row, col-1);

        return down+right;
    }
}
