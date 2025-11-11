package Car;

public class Main {
    public static void main(String[] args) {
        CarBehavior carBehavior = new Toyota();
        carBehavior.turn();
        CarBehavior car = new Benz();
        car.turn();
    }
}
