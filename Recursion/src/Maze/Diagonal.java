package Maze;

import java.util.ArrayList;

public class Diagonal {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        System.out.println(printRet("", 3, 3));
    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int down = count(row - 1, col);
        int right = count(row, col - 1);
        
        int diagonal = 0;
        if(row>1 && col>1){
            // we cant go diagonally if we r at last row or col
            diagonal = count(row-1, col-1);
        }

        return down + right + diagonal;
    }

    public static ArrayList<String> printRet(String p , int row , int col) {
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row>1){
            ans.addAll(printRet(p+"V", row-1, col));
        }
        if(col>1){
            ans.addAll(printRet(p+"H", row, col-1));
        }
        
        if(row>1 && col>1){
            ans.addAll(printRet(p+"D", row-1, col-1));
        }

        return ans;
    }
}
