package switch_case;

public class nested_switch {
    public static void main(String[] args) {
        int emp_id = 1;
        String dept = "IT";

        switch (emp_id){
            case 1:
                System.out.println("Arnab");
                break;
            case 2:
                System.out.println("Ar");
                switch (dept){
                    case "IT":
                        System.out.println("Hllow");
                        break;
                    case "Cse":
                        System.out.println();
                }
        }
    }
}
