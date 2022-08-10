import java.util.Arrays;;
public class Position {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        // int[] result = {-1,-1};

        
        int startingIndexOfTarget = search(arr,target,true);
        int endingIndexOfTarget = search(arr,target,false);

        int[] result = {startingIndexOfTarget,endingIndexOfTarget};

        System.out.println(Arrays.toString(result));
        
    }   
    static int search(int[] arr , int target , boolean firstIndex){
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
