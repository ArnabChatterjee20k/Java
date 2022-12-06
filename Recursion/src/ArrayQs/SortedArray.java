package ArrayQs;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted2(arr, 0));

        int[] arr2 = {1,2,3,4,5};
        System.out.println(isSorted(arr2, 0));
        System.out.println(isSorted2(arr2, 0));
    }
    // check asc sorted array
    public static boolean isSorted(int[] arr,int start) {
        if(start<arr.length-1 && arr[start]>arr[start+1]) return false;
        if(start==arr.length-1) return true;
        return isSorted(arr, start+1);
    }

    // another way
    public static boolean isSorted2(int[] arr,int start) {
        if(start==arr.length-1) return true;
        // if start < start+1 isSorted2 will be called only else it will be returned false
        return arr[start]<arr[start+1] && isSorted2(arr, start+1);
    }
}
