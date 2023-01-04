// *
// **
// ***
// ****
package Patterns;

public class Triangle2 {
    public static void main(String[] args) {
        // iterative
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }

        recursivePattern(3, 0);
    }
    public static void recursivePattern(int row ,int col) {
        if(row==0) return;
        else if(col<row){
            recursivePattern(row,col+1);
            System.out.print("*"); // start will get printed when the function starts getting poped.
            // when they starts poping the function execute the else statement first bcoz due to stacking up the col gets incremented to row.
            // an extra new line at top will comes
        }
        else{
            recursivePattern(row-1, 0);
            System.out.println();
        }
        
    }
}
