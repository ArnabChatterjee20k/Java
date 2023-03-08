package SubsetQuestions;

import java.util.ArrayList;

public class PermutationNTerms {
    static int count = 0;
    public static void main(String[] args) {
        int n=4;
        boolean[] visited = new boolean[n];
        ArrayList<Integer> cur = new ArrayList<>();
        permute(n, cur, visited);
        System.out.println(count);
    }
    static void permute(int n , ArrayList<Integer> cur,boolean[] visited){
        for(int i=0; i<n ; i++){
            if(cur.size() == n){
                // System.out.println(cur);
                ++count;
                return;
            }
            if(!visited[i]){
                visited[i] = true;
                cur.add(i+1);
                permute(n, cur, visited);
                visited[i] = false;
                cur.remove(cur.size()-1);
            }
        }
    }
}
/** Recursive tree
 *  1       2       3
 * 1 2 3  1 2 3   1 2 3     // In first branch of 1 2 3 dont take 1 as it is already taken and marked as visited
 * 
 */
