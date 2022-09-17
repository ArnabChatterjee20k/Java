package CyclicSort;

import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        System.out.println("Hellow");
        int[] arr = {3,1,4,2,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        // if the range of numbers is from 1 to N(length of arr) use => correctIndex = arr[i]-1 
        // if the range of numbers is from 0 to N(length of arr) use => correctIndex = arr[i]
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

    static void swap(int[] arr, int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}