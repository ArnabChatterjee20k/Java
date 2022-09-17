package Stability_Of_Different_Sorting_Algorithms;

import java.util.Arrays;

public class Stability {
    // Stability can be proved by using an array containing duplicates.
    public static void main(String[] args) {
        System.out.println("In array if duplicates are also maintained in order during then it is stable sorting algorithm");
        int[] arr = {4,3,2,7,8,2,3,1};

        bubble(arr);
        System.out.println("Bubble Sort(Stable) =" +" "+ Arrays.toString(arr));
        
        
        insertionSort(arr);
        System.out.println("Insertion Sort(Stable) =" +" "+ Arrays.toString(arr));
        
        selectionSort(arr);
        System.out.println("Selection Sort(Unstable) =" +" "+ Arrays.toString(arr));
        
        cyclicSort(arr);
        System.out.println("Cyclic Sort(Unstable) =" +" "+ Arrays.toString(arr));

    }

    // sorting algorithms
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

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1; // max element is going to be in the last position
            int maxIndex = getMaxIndex(arr , 0 , last);
            // if same element is last and max then it will be swapped by its own
            swap(arr, maxIndex, last);
        }
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

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

    // utility methods
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
