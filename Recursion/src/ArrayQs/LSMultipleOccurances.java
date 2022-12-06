package ArrayQs;

import java.util.ArrayList;

public class LSMultipleOccurances {
    static ArrayList<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5,5,1,2 };
        LS(arr, 2, 0);
        System.out.println(ans);
        
        // returning a list
        System.out.println(LSMul(arr, 5, 0, new ArrayList<>()));

        System.out.println(LSBody(arr, 2, 0));
    }
    

    // building the list inside the function itslef instead of argument or global list
    public static ArrayList<Integer> LSBody(int[] arr, int target, int start) {
        /**
         * This is not optimial but conceptual. Optimal would be use list in the argument
         * Every individual call will be having their newly created list
         * So at the end after the functions getting poped from the stack we can store all the ans returned and return them collectvely
         * After getting called pointer returns to the same postion where it was called
         * So after poping out the current list the list gets added to the list of the function from where it was called
         */
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length) return list;
        if(arr[start] == target) list.add(start); // this will contain answer for that function call only

        // ans list from next calls when they will be poped out from the stack
        ArrayList<Integer> ansFromBelowCalls = LSBody(arr, target, start+1);
        
        list.addAll(ansFromBelowCalls);

        return list;
    }



    // nothing getting returned
    public static void LS(int[] arr, int target, int start) {
        if(start == arr.length) return;
        if(arr[start] == target) ans.add(start);
        LS(arr, target, start+1);
    }
    // returning a ans list
    public static ArrayList<Integer> LSMul(int[] arr, int target, int start,ArrayList<Integer> ansList) {
        if(start == arr.length) return ansList;
        if(arr[start] == target) ansList.add(start);
        return LSMul(arr, target, start+1,ansList);
    }
}
