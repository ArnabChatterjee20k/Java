/**
 * In ascending order sorted array-->
 * If target found we will return the target
 * Else when start>=end that means target is not present between them so the greatest smallest element before the target is the end
 * 
 * Another condition is that what if the target number is smaller than the smallest number in the array then return -1. Means in [2,3,5] if target is 1 then no smallest number than 1 . So return -1.
 * But we dont have to return it it will returned automatically as end will become -1 atlast if target not found
 */
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,16,17,18} ;
        int target = 10;

        System.out.println(floor(arr , target));
    }

    static int floor(int[] arr , int target){
        //end will become -1 atlast if target not found
        // if(target<arr[0]){
        //     return -1;
        // }
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[end];
    }

}
