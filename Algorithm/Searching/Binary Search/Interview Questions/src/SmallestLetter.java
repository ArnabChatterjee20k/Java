// smallest letter in the array greater than the target(ceil)
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a' ;
        System.out.println(smallestLetter(letters, target));
    }
    static char smallestLetter(char[] letters , char target){
        int start = 0;
        int end = letters.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2 ;
            // we dont have return mid here as we have return the smallest greatest character thant the target
            if(target<letters[mid]){
                end = mid - 1;
            }
            // here we are checking if the target is greater than or equal to the current element then go to right
            else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
        // we can also do if start==length return 0
        
        // as we have to return the first element when the target is greater than or equal to the largest element in the array.
        
        // And we know while loop stops when start>=end or start=end+1. If we are moving right continuously them start = length of the array.
        
        // If the target is greater than or equal to the largest element in the array then start will definitely move to right side of the array and it will be equals to length of the array. Hence start%length = 0. For other values like 2%4 it will be 2 only.
    }
}
