package Car;

public class Benz extends Car implements CarBehavior {
    @Override
    public void turn() {
        System.out.println("i'm turning 320");
    }
}
