package ChapterEight.Nine;

public class HourlySalaryEmployee extends  Employee{
    private double wages;
    private double hour;

    public HourlySalaryEmployee(String firstName, String lastName, String socialSecurityNumber,
                                double wages, double hour){
        super(firstName, lastName, socialSecurityNumber);

        if(wages < 0.0 ){
            throw new IllegalArgumentException("wages must be >= 0.0");
        }
        if((hour < 0.0) || (hour > 168.0)){
            throw new IllegalArgumentException("hour must be >= 0.0 or <= 168.0");
        }
        this.wages = wages;
        this.hour = hour;
    }

    public void setWages(double wages) {
        if(wages < 0.0 ){
            throw new IllegalArgumentException("wages must be >= 0.0");
        }
        this.wages = wages;
    }

    public void setHour(double hour) {
        if((hour < 0.0) || (hour > 168.0)) {
            throw new IllegalArgumentException("hour must be >= 0.0 or <= 168.0");
        }
        this.hour = hour;
    }

    public double getWages() {
        return wages;
    }

    public double getHour() {
        return hour;
    }

    @Override
    public double earnings(){
        if(getHour() <= 40){
            return getHour() * getWages();
        }else {
            return 40 * getWages() + (getHour() - 40) * getWages() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWages(),
                "hours worked", getHour());
    }
}
