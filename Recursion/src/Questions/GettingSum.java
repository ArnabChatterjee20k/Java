package Questions;

public class GettingSum {
    // combination of 2 numbers sum upto 3
    public static void main(String[] args) {
        sum("", 0,1);
    }

    public static void sum(String cur, int curSum , int start) {
        if (curSum >= 3 || cur.length() >= 2) {
            if (curSum == 3) {
                System.out.println(cur);
            }
            return;
        }

        // Only iterate over possible digits that can add up to 3 with the current value of curSum
        // int start = (cur.length() == 0) ? 1 : Integer.parseInt(cur.substring(cur.length()-1)) + 1;
        for (int i = start; i <= 9; i++) {
            sum(cur+i, curSum+i, start+1);
        }
    }
}
