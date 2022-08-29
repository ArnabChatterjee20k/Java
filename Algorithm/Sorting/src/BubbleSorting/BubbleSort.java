package BubbleSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,1,12,12,8,-1,0,3,-6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,2,3,4,5};
        bubble(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item will come at the last respective index
            /** 
             * # in this inner loop for a particular value of i or pass
             * # if this inner loop not swapping any values for any value of i that means the array is already sorted.
             * # we will end the program
             */
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                // swapped is false means the no swapping occurs
                break;
            }
        }
    }
}
