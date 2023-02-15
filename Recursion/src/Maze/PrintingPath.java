package Maze;

import java.util.ArrayList;

public class PrintingPath {
    public static void main(String[] args) {
     // apply permutation   
     print("", 3, 3);

     System.out.println(printRet("", 3, 3));
    }
    public static void print(String p , int row , int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            print(p+"D", row-1, col);
        }
        if(col>1){
            print(p+"R", row, col-1);
        }
    }

    public static ArrayList<String> printRet(String p , int row , int col) {
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row>1){
            ans.addAll(printRet(p+"D", row-1, col));
        }
        if(col>1){
            ans.addAll(printRet(p+"R", row, col-1));
        }

        return ans;
    }
}
