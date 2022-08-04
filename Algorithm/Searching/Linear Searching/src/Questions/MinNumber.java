package Questions;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,10,-10};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr.length==0){
            return -1;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
