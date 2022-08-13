public class NumberOfRotations {
    public static void main(String[] args) {
        // unique
        int[] arr = {5,4,3,1,2};
        System.out.println("Pivot index= "+pivotIndex(arr));
        System.out.println("Number of Rotations= "+numberOfRotations(arr));
    }
    static int pivotIndex(int[] arr){
        int start = 0 ;
        int end = arr.length;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int numberOfRotations(int[] arr){
        return pivotIndex(arr)+1;
    }
}
