package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {100,2,3,63,21,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    // with each pass the largest element moves to the end 
    // the pattern getting formed in bubble sort is like the triangl2.
    // here columns mainly depicts the indices. We need to the starting index
    public static void bubbleSort(int[] arr,int r , int c) {
        if(r==0) return;
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);//again start from first col
        }
    }
}
