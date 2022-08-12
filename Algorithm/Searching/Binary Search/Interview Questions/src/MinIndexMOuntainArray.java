public class MinIndexMOuntainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        int target = 3;
        // ascending part
        int start = 0;
        int end = peakIndex(target, arr);
        int result = binarySearch(target, arr , start ,end );
        
        if(result==-1){
            // descending part
            start = end;
            end = arr.length-1;
            result = binarySearch(target, arr , start ,end );
        }
        
        System.out.println(result);
    }
    static int peakIndex(int target , int[] arr){
        int start = arr[0];
        int end = arr.length-1;
        
        while(start<end){
            int mid = start + (end-start)/2;
            int afterMid = mid + 1;
            
            int midElement = arr[mid];
            int after_midElement = arr[mid+1];
            
            // ascending order
            // peak Index will be in the right side
            // this element cant be the peak element 
            if(midElement<after_midElement){
                start = afterMid;
            }
            // descending order
            // probable ans
            else{
                end = mid;
            }
        }
        return start;
    }
    
    
    static int binarySearch(int target ,int[] arr, int start , int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            int midElement = arr[mid];
            
            boolean isAsc = arr[start]<arr[end];
            
            if(midElement==target){
                return mid;
            }
            if(isAsc){
                if(midElement>target){
                    end = end - 1;
                }
                else if(midElement<target){
                    start = start + 1;
                }
            }
            else{
                if(midElement>target){
                    start = start + 1;
                }
                else if(midElement<target){
                    end = end - 1;
                }
            }
        }
        return -1;
    }
}
