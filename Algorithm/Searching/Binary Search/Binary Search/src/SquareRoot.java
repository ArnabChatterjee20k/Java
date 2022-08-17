// if perfect square does not exist then return floor of the ans
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));        
    }
    static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        // as mid can be very large so x/mid will reduce the size and mid*mid=x and thus mid=x/mid
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid==x/mid){
                return mid;
            }
            // x/mid as mid can ve large
            if(mid<x/mid){
                ans = mid;
                start=mid+1;
            }
            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
