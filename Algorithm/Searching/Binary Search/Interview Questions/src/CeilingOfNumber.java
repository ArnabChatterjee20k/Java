/**
 * arr in ascending order is given
 * target given 
 * find the ceiling of the target in the arr
 * ceiling means we have to find smallest element 
   than or equal to the target element.

   arr=[2,3,4,5,6,7,16,18]
   target = 14
   ceiling will be 16
*/

/**
 * In ascending order,--->
 * We will look for the target if found we will return that otherwise below is the logic.
 * The condition for stopping binary search is start>=end.
 * And we know the target element if between start and end. Start target end and if target not fot found then at last it will become end target start. And we know element is always between start and end but here target is present so when start becomes greater than end then we can say start is the ceil of the target element
 * 
 * After start becomes greater than end start becomes greater than target as well. SO at the end Start value will be our ans. Or after the Start becomes greater than end it becomes the ceil of the target element(smallest greater than target)
 * 
 * So instead of returning -1 at the end of the while loop we will return the start value.
 */
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,16,17,18} ;
        int target = 1;
        
        System.out.println(ceil(arr, target));
    }

    static int ceil(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start= mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start]; // as if element not found it will be  the smallest greatest integer of target
    }
}