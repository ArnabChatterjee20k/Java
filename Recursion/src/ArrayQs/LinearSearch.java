package ArrayQs;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };
        System.out.println(LS(arr, 2, 0));
        System.out.println(LSIndex(arr, 2, 0));
        System.out.println(LSIndex(arr, 9, 0));

        System.out.println(LSIndexLast(arr, 2, arr.length - 1));
        System.out.println(LSIndexLast(arr, 0, arr.length - 1));
    }

    public static boolean LS(int[] arr, int target, int start) {
        if (start == arr.length)
            return false;
        return arr[start] == target || LS(arr, target, start + 1);

        // if want to return index then return -1 in base condtion
        // use if else with recursive call
    }

    public static int LSIndex(int[] arr, int target, int start) {
        if (start == arr.length)
            return -1;
        if (arr[start] == target)
            return start;
        return LSIndex(arr, target, start + 1);
    }

    public static int LSIndexLast(int[] arr, int target, int end) {
        if (end == -1)
            return -1;
        if (arr[end] == target)
            return end;
        return LSIndexLast(arr, target, end - 1);
    }
}
