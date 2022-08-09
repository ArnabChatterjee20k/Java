public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ascArr = {-2,-1,0,1,2,3,4,5};
        int target = 0;
        System.out.println(orderAgnosticBS(ascArr, target));

        int[] desArr = {100,90,80,1,0,-1};
        target = 80;
        System.out.println(orderAgnosticBS(desArr, target));
    }
    static int orderAgnosticBS(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;

        // checking if ascending or not. If not ascending then descending 
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return  mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1; 
                }
                else if(target>arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid - 1; 
                }
                else if(target>arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
