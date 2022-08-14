public class RotatedArray_With_Duplicates {
    public static void main(String[] args) {
        System.out.println(mainProg());
    }
    static int mainProg(){
        int[] nums = {2,9,2,2,2};
        int target = 2;

        int pivot = pivot_In_Array_With_Duplicates(nums);
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

    static int pivot_In_Array_With_Duplicates(int[] arr){
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
            // if elements at middle , start and end are equal then just skip them
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // skipping the duplicastes if not pivot
                
                // check for start
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //check for end
                if(arr[end]<arr[end]-1){
                    return end;
                }
                end--;
            }
            // left side is sorted so pivot in right side
            // # if arr[start]<arr[mid] then definitely arr[end]<arr[mid] as arr[end] = arr[start] or arr[end]<arr[start]
            else if( (arr[start]<arr[mid]) || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1; // ignoreing left side values
            }
            // ignore right side values pivot in left side
            else{
                end = mid-1;
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
