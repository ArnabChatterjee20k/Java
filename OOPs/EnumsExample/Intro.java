package EnumsExample;

public class Intro {
    enum Week{
        // these are enum constants
        // these are public , static and final
        // since its final you cant create child ones
        // type is Week
        Monday,Tuesday,Wednesday,Thursday;
    }   
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week); //Monday
        System.out.println(week.ordinal()); //Index or position in the enum

        System.out.println(Week.Thursday.ordinal());
        
        for(Week day:Week.values()){
            System.out.println(day);
        }

    }
}