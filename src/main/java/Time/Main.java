package Time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();

        displayTime("after object is created", time);
        System.out.println();

        time.setTime(14,25,54);
        displayTime("after calling set time", time);
        System.out.println();

        try{
            time.setTime(89,75,65);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("after calling set time with an invalid value", time);
    }
    private static void displayTime(String header, Time t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                 header, t.toUniversalString(),t.toString() );
    }
}
