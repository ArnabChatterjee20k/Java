package ArrayQs;
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {4,4,1};
        System.out.println(canJump(nums));

        System.out.println(greedy(nums));
    }

    // using greedy(more optimised) -> Linear Time
    static boolean greedy(int[] nums){
        // we will be shifing the last index backward to the first index. We will check whether index before last index is able to reach the moving last index at each change.
        int goal = nums.length-1; // the last index

        // now if current index is 1 and max jump we can make is 2 and goal is at jump 2
        // so we can make a max jump upto index 2+1=3 and 3>=2 basically if the summation of jump and index is greater then the goal index definitely it is having chances to make a jump to that index.

        for (int i = nums.length-1; i >=0; i--) {
            if(i+nums[i]>=goal){
                goal = i;
            }
        }

        if(goal==0) return true ; // if at end goal index is at exactly 0 then we can make a jump
        return false;
        
    }

    // using dynamic programming - without cache it will be time limit exceeded but still after adding cache it is unoptimsed
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
