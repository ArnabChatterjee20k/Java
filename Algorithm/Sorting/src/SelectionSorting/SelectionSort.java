package SelectionSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = {1,1,12,12,8,-1,0,3,-6};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }   
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1; // max element is going to be in the last position
            int maxIndex = getMaxIndex(arr , 0 , last);
            // if same element is last and max then it will be swapped by its own
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max = start; // take start as max not 0 index because if the array only contains negative numbers then max will be set to 0 and it is a bug
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
