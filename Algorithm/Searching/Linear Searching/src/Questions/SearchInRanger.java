package Questions;

public class SearchInRanger {
    public static void main(String[] args) {
        int[] arr = {1,2,5,10,-12,3,23-12};
        int target = 3;

        int minRange = 1;
        int maxRange = 5;

        System.out.println(search(arr, target, minRange, maxRange));
    }

    static int search(int[] arr , int target , int minRange , int maxRange){
        if(arr.length==0){
            return -1;
        }

        for (int index = minRange; index <= maxRange; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}