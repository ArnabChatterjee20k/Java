package Questions;

public class KthBit {
    public static void main(String[] args) {
        System.out.println(kthGrammar(3, 1));
    }

    static int kthGrammar(int n, int k) {
        if (n == 1)
            return 0;
        
        // through this call we are basically traversing back to the parent node
        int parentNode = kthGrammar(n - 1, k / 2 + k % 2);
        
        // if k is odd
        boolean isKOdd = k % 2 == 1;

        // for parentNode 1
        if (parentNode == 1) {
            if (isKOdd) {
                return 1;
            }
            return 0;
        }

        // for parentNode 0
        else {
            if (isKOdd) {
                return 0;
            }
            return 1;
        }

    }
}
