package SubsetQuestions;

public class NumberOfDiceRollsWithTarget {
    public static void main(String[] args) {
        int target = 4;
        roll("", target);
        roll2("", target,6);
    }

    // taking p as string to get the combination
    static void roll(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        // 6 is the number of faces. If face is not 6 take it in the argument and use here
        for (int i = 1; i <= 6 && i <= target; i++) {
            roll(p + i, target - i);
        }
    }
    
    static void roll2(String p, int target,int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        // 6 is the number of faces. If face is not 6 take it in the argument and use here
        for (int i = 1; i <= face && i <= target; i++) {
            roll(p + i, target - i);
        }
    }
}