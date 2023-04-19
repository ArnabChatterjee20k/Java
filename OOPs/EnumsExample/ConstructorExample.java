package EnumsExample;

public class ConstructorExample {
    enum Month{
        Jan,Feb,Mar,Apr,May,June,July;
        // constructor of the Month enum
        // constructor is not public or protected.
        // only private ir default
        // This disallow creation of new objects as it is not the enum concept

        // internally it is like public static final Week Monday = new Week();
        Month(){
            System.out.println("Constructor called for "+this);
        }
    }

    public static void main(String[] args) {
        Month month;
        month = Month.Apr;
        // System.out.println(month);
    }
}