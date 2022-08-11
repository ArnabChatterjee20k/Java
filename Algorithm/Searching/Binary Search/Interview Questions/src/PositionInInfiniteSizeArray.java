// Infinite array so we cant use length
public class PositionInInfiniteSizeArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,100, 130, 140, 170} ;
        int target = 90;

        System.out.println(findingRange(arr, target));

    }
    static int findingRange(int[] arr , int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        /** 
         * TODO:- condition for target to lie in the range or chunk
         * 
         * # Now if target is greater than the end then it will be sure that it will be greater than start
         * 
         * # Now if element is less than end then it is greater than start. If it has been less than start then it would have been caught in the previous chunk.
        */

        while(target>arr[end]){
            int newStart = end + 1;
            /** 
             * Todo:- double the box value
             * ## new end = previous end + 2*sizeOfBox
             * ## 0 to 6 means box of size = 7 = 6-0+1 = 7 
            */
            end = end + 2*(end-start+1);
            start = newStart;
        }

        return binarySearch(arr, target, start, end);


    }
    static int binarySearch(int[] arr , int target , int start , int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
