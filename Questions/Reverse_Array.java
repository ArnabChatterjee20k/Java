import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7} ;

        // indices
        int start = 0;
        int end = arr.length - 1 ;

        // we will start switch start index element and end index element. After switching start increament by 1 and end decreament by 2.
        // it will continue till the middle element crossed that is start>=end
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start+=1;
            end-=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
