package SubsetQuestions;

public class NumberOfDiceRollsFromArray {
    public static void main(String[] args) {
        roll("", 4, 0);
        roll2("", 4);
    }

    static void roll(String p, int target, int sum) {
        // here we are trying every possibility so using a third param sum
        int[] dice = { 1, 2, 3, 4, 5, 6 };
        if (sum == target) {
            System.out.println(p);
            return;
        }
        if(sum>target) return;
        for (int i : dice) {
            roll(p + i, target, sum + i);
        }
    }

    static void roll2(String p, int target) {
        int[] dice = { 1, 2, 3, 4, 5, 6 };

        // 1 min of dice and 6 max of dice
        // just find min and max before the loop and use its

        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            roll2(p + i, target - i);
        }
    }
}
