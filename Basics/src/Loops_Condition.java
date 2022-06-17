public class Loops_Condition {
    public static void main(String[] args) {
        int a = 10;
        if(a == 10){
            System.out.println("a is "+a);
        }
        // when we dont know how many times the loop will run
        while (a<20){
            System.out.println(a);
            a++;
        }

        // when we know how many times the loop will run
        for (a=a;a<40;a++){
            System.out.println("Hellow");
        }
    }
}
