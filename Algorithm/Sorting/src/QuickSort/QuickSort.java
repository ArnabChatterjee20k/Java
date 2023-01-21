package QuickSort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,39,1,0,2};
        qs(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void qs(int[] nums,int low , int high){
        if(low>=high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = nums[mid];

        while(start<=end){

            // if array is sorted then the swapping will not take place
            while(nums[start]<pivot) start++;
            
            while(nums[end]>pivot) end--;

            if(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // pivot is at correct index so now sort the LHS halves and RHS halves of pivot
        qs(nums, low, end);
        qs(nums, start, high);

    }
}