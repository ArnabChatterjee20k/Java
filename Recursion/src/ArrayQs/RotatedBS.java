package ArrayQs;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3}; // rotated array
        System.out.println(RBS(arr, 8, 0, arr.length-1));
    }
    public static int RBS(int[] arr , int target, int start,int end) {
        if(start>end) return -1;

        int mid = start+(end-start)/2;

        if(arr[mid] == target) return mid;

        // first half is sorted
        if(arr[start]<=arr[mid] ){
            if(target>=arr[start] && target<=arr[mid]){
                return RBS(arr, target, start, mid-1);
            }
            else{
                RBS(arr, target, mid+1, end);
                return RBS(arr, target, mid+1, end);
            }
        }
        else if(target>=arr[mid] && target<=arr[end]){
            return RBS(arr, target, mid+1, end);
        }

        else return RBS(arr, target, mid-1, end);

    }
}
