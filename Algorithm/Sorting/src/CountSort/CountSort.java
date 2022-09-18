package CountSort;
import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 3, 5, 3, 4, 3, 9, 4, 6, 5, 8, 2, 9 };

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        countSort(arr, max, min);
        System.out.println(Arrays.toString(arr));
    }

    static void countSort(int[] arr,int max,int min){
        int range = max - min + 1;
        // frequency array
        int[] freq_arr = new int[range];

        for (int num : arr) {
            int index = num - min;
            freq_arr[index]++;
        }

        // converting frequency array to prefix sum array representing position not
        // index.
        // index = position-1
        for (int i = 1; i < freq_arr.length; i++) {
            freq_arr[i] += freq_arr[i - 1];
        }

        int[] ans = new int[arr.length];
        // looping in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = freq_arr[val - min];
            int index = pos - 1;
            ans[index] = val;

            // decrementing frequency of the inserted element
            freq_arr[val-min]--;
        }

        // changing the elements of original arr
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }
}


