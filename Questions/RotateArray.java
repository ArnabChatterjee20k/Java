import java.util.Arrays;

// Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
public class RotateArray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 12, 11, 2, 5, 7, -1, 23, 2, 3};
        // int[] arr = {1, 2, 12};
        int pos = 2;

        one_by_one(arr, pos);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateUsingTempArr(int[] arr , int pos){
        int[] temp = new int[pos];
        int i = 0;
        while(i<pos){
            temp[i] = arr[i];
            i++;
        }

        // decreasing the index of each element of the arr by pos after pos-1 index
        int swapped = pos;
        while(swapped<arr.length){
            int t = arr[swapped];
            arr[swapped] = arr[swapped-pos];
            arr[swapped-pos] = t;
            swapped++;
        }

        // after decrementing the indices by 2 we will be left with 2 blank spaces(here duplicates will be their) in the arr
        int blank = arr.length-pos;
        int j = 0;
        while(blank<arr.length){
            arr[blank++] = temp[j++];
        }
    }

    static void short_rotateUsingTemp(int[] arr , int pos){
        int[] result = new int[arr.length];

        // copy elements from pos to result
        int j = 0 ;
        for (int i = pos; i < arr.length; i++) {
            result[j++] = arr[i];
        }

        // copy elements upto d at the end of the result.s
        // j is upto the index of the last element in the result. j = result.length-pos
        System.out.println(j);
        for (int i = 0; i < pos; i++) {
            result[j++] = arr[i];
        }

        // copying elements of result into result
        for (int i = 0; i < result.length; i++) {
            arr[i] = result[i];
        }
        
    }

    static void one_by_one(int[] arr,int pos){
        // decrement index pos times
        // first element will go to last. So do it manually

        int pass = 0;
        while(pass<pos){
            int last = arr[0];
            for (int index = 0; index < arr.length-1; index++) {
                arr[index] = arr[index+1];    
            }
            arr[arr.length-1] = last;
            pass++;
        }
    }
}