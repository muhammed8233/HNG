package ChapterEight.Nine;

public class PolymorphismTest {
    public static void main(String[] args) {

         CommissionEmployee employee = new CommissionEmployee("bala", "sani",
            "234-567-231", 2000, 0.6);

         BasePlusCommissionEmployee basePlusCommission = new BasePlusCommissionEmployee("shafiu",
                 "yahaya","278-3545-3567",3000, 0.1,2500);

        System.out.printf("%s %s: %n%n%s%n%n", "call commission employee's toString with super class references",
                "to super class object", employee.toString());

        System.out.printf("%s %s: %n%n%s%n%n", "call base plus commission employee's toString with super class",
                "references to subclass object", basePlusCommission.toString());

        CommissionEmployee commissionEmployee =  basePlusCommission;

        System.out.printf("%s %s: %n%n%s%n%n", "call commission employee's toString with super class references",
                "to super class object", commissionEmployee.toString());
    }
}
