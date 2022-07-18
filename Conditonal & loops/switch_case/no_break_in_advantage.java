package switch_case;

public class no_break_in_advantage {
    public static void main(String[] args) {
        String day = "monday";

        switch (day){
            case ("monday"):
            case ("tuesday"):
            case ("wednesday"):
            case ("thursday"):
            case ("friday"):
                System.out.println("weekday");
                break;
            case ("saturday"):
            case ("sunday"):
                System.out.println("weekend");
                break;
        }

        switch (day) {
            case ("monday"), ("tuesday"), ("wednesday"), ("thursday"), ("friday") -> System.out.println("weekday");
            case ("saturday"), ("sunday") -> System.out.println("weekend");
        }
    }
}
