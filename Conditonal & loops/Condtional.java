public class Condtional {
    public static void main(String[] args) {
        /*
        * Syntax of if statement
        * if(boolean expression){
        *       //body
        * } else if{
        *       // do this
        * } else{
        *       // do this
        * }
        * */

        int salary = 25400;
        if(salary>10000){
            salary=salary+2000;
        } else {
            salary=salary+1000;
        }
        System.out.println(salary);
    }
}
