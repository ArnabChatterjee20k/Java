public class Loops {
    public static void main(String[] args) {
        /*
        * for loop
        * for(initialisation;condition;increament/decreament){
        *   // body
        * }
        * */

        for(int num=1;num<=5;num++){
            System.out.println(num);
        }

        /*
        * while loop
        * while(condition){
        *   //body
        * }
        * */
        int num=1;
        while (num<=5){
            System.out.println(num);
            num+=1;
        }


        /*
        * do while loop
        * do{
        *   //body
        *  } while(condtion);
        * */
        int n=1;
        do {
            System.out.println(n);
            n++;
        } while(n<=10);

    }
}