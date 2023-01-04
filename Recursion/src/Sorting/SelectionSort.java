package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 100, 2, 3, 63, 21, 1, 101 };
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int r, int c, int max) {
        if (r == 0)
            return;
        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, max);
            }
        } else {
            // before the next pass swap the indices
            // after evaluating the range we have a maximum
            // so swap with last element and max
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selectionSort(arr, r-1, 0, 0);
        }
    }

    public static int max(int[] arr, int start, int end, int curMax) {
        if (start > end)
            return start; // to check upto last
        return max(arr, start + 1, end, Math.max(curMax, arr[start]));
    }
}
