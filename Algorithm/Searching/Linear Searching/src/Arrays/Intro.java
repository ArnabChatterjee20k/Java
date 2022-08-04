package Arrays;
public class Intro {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,4,5,6,7,8,10,12};
        int target = 12;
        System.out.println(linarSearch(nums, target));
    }

    /**
     * Linear searching in the array
     * 
     * Search in the array: return the index if item found
     * otherwise if item not found return -1
     * 
     * We can also return the element instead of index.
     * In this case where index is not getting used use foreach
     * 
    */

    static int linarSearch(int[] arr , int target) {
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for(int index = 0 ; index<arr.length ; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // -1 will be returned if index not found because no return will be hit above if element not found
        return -1;
    }
}
