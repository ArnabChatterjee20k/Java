public class Pallindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPallindrome(str));
    }

    static boolean isPallindrome(String str){
        // null is at first as if the string is null it does not have any length.
       if(str==null || str.length()==0){
           return true;
       }
        /*
         * If the current element and (lastIndex - current element Index) element is same then they pallindrome
         * or curElement == (length-1 - curElement Index) Element
         *
         *  So Just we have to run a loop upto middle Index
         */

        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
