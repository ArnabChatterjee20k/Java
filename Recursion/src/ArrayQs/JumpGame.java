package ArrayQs;
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {4,4,1};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length]; // for storing the visited places. Visited places will be set to true
        return jump(nums,0,dp);
    }
    static boolean jump(int[] nums,int pos,boolean[] dp){
        if(pos>nums.length-1) return false;
        if(pos==nums.length-1) return true;

        if(dp[pos]) return false; // checking pos is being visited or not

        dp[pos] = true;// markinng pos as visited
        boolean result = false;
        
        // iteraing through all the jumps
        // at beginning i will be only 1 and when pos will be either matching base condition or nums[pos]<i then the values will getting assigned and the loop will run
        for(int i=1 ; i<=nums[pos] ; i++){
            // when the jump will be poped then pos will its value will be returned
            result = result || jump(nums,pos+i,dp); // result || jump(nums,1) || jump(nums,2) || jump(nums,3).... and atlast the loop will run
        }

        return result;
    }
}
