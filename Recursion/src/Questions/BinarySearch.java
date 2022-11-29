package Questions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(BS(arr, 3,0 , arr.length-1));
    }
    static int BS(int[] arr,int target , int start , int end){
        // since a return value is required so we are returning in every call.
        // when a value will be returned then the returned value will be the return value of the function from where it was called.
        if(start>end){
            return -1;
        }
        int mid = start+(end-start);
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]>target){
            return BS(arr,target,start,mid-1);
        }
        else{
            return BS(arr,target,mid+1,end);
        }
    }
    
}
