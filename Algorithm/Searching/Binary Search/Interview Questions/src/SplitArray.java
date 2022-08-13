public class SplitArray {
    public static void main(String[] args) {        
        int[] nums = {1,2,3,4,5};
        int m = 1;

        System.out.println(splitArray(nums, m));
    }
    static int splitArray(int[] nums, int m) {
        // finding the max and min elment using linear search
        int start = 0;
        int end = 0; // max => sum of all elements
        for(int i=0 ; i<nums.length ; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        
        // binary search in the range
        while(start<end){
            int mid = start+(end-start)/2;// try for the middle as potential ans
            
            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;// as min piece will be 1
            
            for(int num:nums){
                if(sum+num>mid){
                    // we cant add this in the subarray we have make new one
                    // say you add this num in the subarray then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            // increasing the range so that our sum increases
            if(pieces>m){
                start = mid+1;
            }
            // decreasing so that our sum decreases
            else{
                end=mid;
            }
        }
        return end;// or start as start == end
    }
}
