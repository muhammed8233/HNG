package ChapterEight.Nine;

public class Main {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("musa", "salisu",
                "12345678", 10000.0, 0.6);

        System.out.println("Employee information obtained by get method");
        System.out.printf("%n%s %n%s", "First name is", employee.getFirstName());
        System.out.printf("%n%s %n%s", "Last name is", employee.getLastName());
        System.out.printf("%n%s %n%s", "social security number is ", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %n%.2f", "Gross sales is", employee.getGrossSales());
        System.out.printf("%n%s %n%.2f", "commission rate is", employee.getCommissionRate());
        employee.setGrossSales(10000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s: %n%n%s%n", "updated employee information obtained by toString", employee);
    }
}
