package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,1,12,12,8,-1,0,3,-6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,2,3,4,5};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        
        int[] arr3 = {45,0};
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    static void insertionSort(int[] arr){
        // outer loop or pass from 0 to N-2 or less than N-1
        // inner loop from i+1 to 0
        for(int i=0 ; i<arr.length-1 ; i++){
            for (int j = i+1 ; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    // if previous element is smaller than current that means the LHS is sorted already
                    break;
                }
            }
        }
    }
    
    static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
