public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        System.out.println(mainProg());
    }
    static int mainProg(){
        int[] nums = {3,4,5,1,2};
        int target = 3;

        int pivot = pivot(nums);
        if(pivot==-1){
        // if pivot not exists then one single sorted ascending array
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        
        // if target <= start
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            // 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[mid]>arr[start]){
                start = mid+1; // definitely some bigger element is present after mid. 
                                            // If not then it would have been returned by case1 or 2
                                            // so ignoring all elements upto mid 
            }
            else{
                end = mid-1; // pivot will be always in first part
                            // we are in second part so ignoring all elements from mid to end

            }
        }
        return -1;
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
