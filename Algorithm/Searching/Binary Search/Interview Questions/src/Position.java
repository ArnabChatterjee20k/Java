class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] result = {-1,-1};
        
        result[0] =  search(arr,target,true);
        
        if(result[0]!=-1){
            // since -1 means element is not present in the array so no need to check for the end Index as well.
            result[1] = search(arr,target,false);
        }
        
        return result;
        
    }
    public int search(int[] arr , int target , boolean firstIndex){
        int ans = -1;
        
        int start = 0 ;
        int end = arr.length - 1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = end - 1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                // potential ans found but it may not be the first Index or last index . So now if first Index is true then search on the left of the mid else on the right side of the mid
                ans = mid;
                if(firstIndex){
                    end = mid - 1;
                }
                else{
                    start = start + 1;
                }
            }
        }
        return ans;
    }
}