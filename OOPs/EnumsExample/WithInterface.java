package EnumsExample;

public class WithInterface {
    interface A{
        void hello();
    }
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday;
        @Override
        public void hello(){
            System.out.println(this);
            System.out.println(this.ordinal());
        }
    }

    public static void main(String[] args) {
        Week week = Week.Monday;
        week.hello();
    }
}
