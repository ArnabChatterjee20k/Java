package Questions;

public class Pallindrome {
    public static void main(String[] args) {
        String str = "mamq";
        System.out.println(check(str.toCharArray(), 0));
    }
    public static boolean check(char[] arr,int start) {
        // for string we can also use char at
        int end = arr.length-start-1;
        if(arr[start] != arr[end]) return false;
        else if(start<=end) return true;
        return check(arr, start+1);
    }
}
