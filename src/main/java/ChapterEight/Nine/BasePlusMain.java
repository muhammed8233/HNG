package ChapterEight.Nine;

public class BasePlusMain {
    public static void main(String[] args) {
        BasePlusCommissionEmployee base = new BasePlusCommissionEmployee("habib","sule",
                "980-9876-456", 4000, 0.3, 400);

        System.out.println("Employee information obtained by get method");
        System.out.printf("%n%s %n%s", "First name is", base.getFirstName());
        System.out.printf("%n%s %n%s", "Last name is", base.getLastName());
        System.out.printf("%n%s %n%s", "social security number is ", base.getSocialSecurityNumber());
        System.out.printf("%n%s %n%.2f", "Gross sales is", base.getGrossSales());
        System.out.printf("%n%s %n%.2f", "commission rate is", base.getCommissionRate());
        System.out.printf("%n%s %n%.2f", "base salary is", base.getBaseSalary());
        base.setBaseSalary(500);

        System.out.printf("%n%s: %n%n%s%n%n ", "updated employee information obtained by toString", base);
    }
}
