package Time;

public class Time2Main {
    public static void main(String[] args) {
        Time2 time2 = new Time2();
        Time2 time3 = new Time2(1);
        Time2 time4 =  new Time2(21,23);
        Time2 time5 = new Time2(12,35,45);
        Time2 time6 = new Time2(time5);

        System.out.println("Constructor with");
        displayTime("time2: all default argument: ", time2);
        displayTime("time3: hour specified; default minute and second ", time3);
        displayTime("time4: hour and minute specified; default second", time4);
        displayTime("time5: hour, minute and second specified", time5);
        displayTime("time6: Time2 object time5 specified", time6);


        try{
            Time2 time7 =new Time2(82,75,99);
        }
        catch(IllegalArgumentException e){
            System.out.printf("%n Exception while initializing t7: %s%n", e.getMessage());
        }
    }
    public static void displayTime(String header, Time2 t){
        System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
    }
}
