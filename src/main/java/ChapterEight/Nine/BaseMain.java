package ChapterEight.Nine;

public class BaseMain {
    public static void main(String[] args) {
        BaseCommissionEmployee employee = new BaseCommissionEmployee("musa", "salisu",
                "12345678", 10000.0, 0.6, 400);

        System.out.println("Employee information obtained by get method");
        System.out.printf("%n%s %n%s", "First name is", employee.getFirstName());
        System.out.printf("%n%s %n%s", "Last name is", employee.getLastName());
        System.out.printf("%n%s %n%s", "social security number is ", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %n%.2f", "Gross sales is", employee.getGrossSales());
        System.out.printf("%n%s %n%.2f", "commission rate is", employee.getCommissionRate());
        System.out.printf("%n%s %n%.2f", "base salary is", employee.getBaseSalary());
        employee.setBaseSalary(500);

        System.out.printf("%n%s: %n%n%s%n", "updated employee information obtained by toString", employee);
    }
}
