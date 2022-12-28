public class Fibonci {
    public static void main(String[] args) throws Exception {
        System.out.println(nFib(4+1)); // since count start from 0
        System.out.println(nFib(55+1)); // since count start from 0
    }

    static int nFib(int n) {
        // Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1-Math.sqrt(5))/2), n) ;
        // return (int)((Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1-Math.sqrt(5))/2), n))/Math.sqrt(5)) ;
        
        // removing less dominating term
        return (int)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5)) ;
    }
}
