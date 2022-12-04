public class ConceptOfPassing {
    public static void main(String[] args) {
        // wrongF(4);
        correctF(4);
    }
    public static void wrongF(int n) {
        if(n==0) return;
        System.out.println(n);
        wrongF(n--); // everytime it will pass n without subtracting so our base condition will be never met leading to error
    }

    public static void correctF(int n) {
        if(n==0) return;
        System.out.println(n);
        correctF(--n);
    }
}

// --n vs n--
// n-- this pass the value of n first then subtract it
// --n this pass the value by subtracting 1 from n
