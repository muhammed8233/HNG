package Car;

public class Toyota extends Car implements  CarBehavior{
    @Override
    public void turn() {
        System.out.println("i'm turning 180");
    }

}
