public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2,1,0,1,2,3,4,5}; // must be sorted
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }
    // return index
    // return -1 if not exists
    static int binarySearch(int[] arr , int target){
        // binary searching of ascending order sorted array
        int start = 0 ;
        int end = arr.length;
        
        while (start<=end){
            // find the middle element
            // int mid = (start+end)/2; 
            // we cant use int as start + end for very large number as it can exceed int range
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid; // ans found
            }
        }
        return -1;
    }
}
