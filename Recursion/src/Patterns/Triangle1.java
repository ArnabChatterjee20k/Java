// ****
// ***
// **
// *
package Patterns;

public class Triangle1 {
    public static void main(String[] args) {
        // iterative approach
        for(int i=5 ; i>=1;i--){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        recursivePattern(5, 0);
    }
    
    public static void recursivePattern(int row ,int col) {
        if(row==0) return;
        else if(col<row){
            System.out.print("*");
            recursivePattern(row,col+1);
        }
        else{
            System.out.println();
            recursivePattern(row-1, 0);
        }
        
    }
}
