public class PeakElement_MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int start = 0;
        int end = arr.length-1;
        // continue upto start<end not start<=end as when start=end we get our ans. 
        // And when start=end and at that point end=mid. So they will not changing anymore and it becomes an infinite loop
        while(start<end){
            int mid = start+(end-start)/2;

            // descending order
            // arr[mid]>arr[mid+1]
            // mid can be the potential answer. Also the mid may be in the left side of the mid.
            // Check it.
            // mid can also be the answer so consider it in range.

            if(arr[mid]>arr[mid+1]){
                end = mid; 
                // this may be the ans thats why end != mid - 1. 
                // Considering it in the searching range
            }
            
            // ascending order
            // mid will never be the ans so need to consider it in the search range
            // Potential answer will not be mid as peak element will be definitely in the right side.
            else{
                start = mid+1; 
                // beacause mid+1 element > mid element.
                // eliminating mid out of the searching range.
            }
        }
        System.out.println(start);
    }
}
