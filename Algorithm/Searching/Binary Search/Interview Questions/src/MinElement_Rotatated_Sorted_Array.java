public class MinElement_Rotatated_Sorted_Array {
    public static void main(String[] args) {
        // int[] nums = {1}; 
        // int[] nums = { 3, 4, 5, 1, 2 }; 
        int[] nums = { 3, 4, 2 }; 
        int start = 0;
        int end = nums.length-1;
        
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]==nums[end]){
                end--;
            }
            else if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(start);
    }
}
