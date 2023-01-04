package MergeSort;

import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        Arrays.toString(mergeSort(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    // Not inplace so we are returning array
    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left,right); // this will return an array which will ultimately get stored in left and right
                                // which again gets passed here and ultimated
    }
    public static int[] merge(int[] first,int[] second) {
        int[] mix = new int[first.length + second.length];
        
        int i = 0; // first array pointer
        int j = 0; // second array pointer
        int k = 0;  // mixed array pointer

        while (i<first.length && j<second.length) {
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;

            
        }        
        // it may be possible that 2 arrays are not of equal size that is one pointer moves to the end and other one is still pointing
        // add all the remaining elements

        // any of the two will run
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}