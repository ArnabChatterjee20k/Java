package Arrays;
public class Searching_Element {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,10,12};
        int target = 12;
        System.out.println(linearSearch(nums, target));
    }

    static int linearSearch(int[] arr , int target) {
        // here we cant return -1 as -1 can be the element itself
        // so return any constant value rather like max value of Integer
        // also we can return a boolean value.
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
