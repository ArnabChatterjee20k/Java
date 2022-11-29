package Questions;

public class AddArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(add(arr, 0, 0));
        System.out.println(add2(arr, arr.length));
    }
    static int add(int[] arr,int i , int sum){
        // base condition
        // the returned value will be returned value of the function that call the function
        if(i>=arr.length) return sum;
        // body
        sum+=arr[i];
        i++;

        return add(arr, i, sum);
    }

    static int add2(int[] arr,int n){
        if(n<=0) return 0;
        return add2(arr, n-1)+arr[n-1];
    }
}
