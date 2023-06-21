package Questions;
// https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.Arrays;

public class GameOf2Stacks {
    public static void main(String[] args) {
        int[] a = {4,2,4,6,1};
        int[] b = {2,1,8,5};

        int maxSum = 10;

        System.out.println(TwoStacks(a, b, maxSum));
    }

    public static int TwoStacks(int[] a, int[] b, int maxSum) {
        // why -1? cause we are stopping our code when our sum exceeds
        // so we have one extra count
        return getMoves(maxSum, a, b, 0, 0) - 1;
    }

    private static int getMoves(int maxSum, int[] a, int[] b, int sum, int count) {
        if (sum > maxSum || a.length == 0 || b.length == 0)
            return count;

        int[] aAfterRemoval = Arrays.copyOfRange(a, 1, a.length);
        int ans1 = getMoves(maxSum, aAfterRemoval, b, sum + a[0], count + 1);

        int[] bAfterRemoval = Arrays.copyOfRange(b, 1, a.length);
        int ans2 = getMoves(maxSum, a, bAfterRemoval, sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }
}