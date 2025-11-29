package ChapterEight.Nine;

public class PayRollSystem {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("mukthar",
                "suleiman","111-222-111",5000);

        HourlySalaryEmployee hour = new HourlySalaryEmployee("sagir",
                "sani","098-658-217",2000,2);

        CommissionEmployee2 employee2 = new CommissionEmployee2("laraba",
                "sunday","423-541-1325", 10000,0.8);

        BasePlusCommissionEmployee2 commissionEmployee2 = new BasePlusCommissionEmployee2("samuel", "monday",
                "875-43645-6586",20000,0.9,5000);


         System.out.println("Employees processed individually:");

         System.out.printf("%n%s%n%s: $%,.2f%n%n",
                 salariedEmployee, "earned", salariedEmployee.earnings());
         System.out.printf("%s%n%s: $%,.2f%n%n",
                 hour, "earned", hour.earnings());
         System.out.printf("%s%n%s: $%,.2f%n%n",
                employee2, "earned", employee2.earnings());
         System.out.printf("%s%n%s: $%,.2f%n%n",
                 commissionEmployee2,
                "earned", commissionEmployee2.earnings());
         Employee[] employees = new Employee[4];

         employees[0] = salariedEmployee;
         employees[1] = hour;
         employees[2] = employee2;
         employees[3] = commissionEmployee2;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusCommissionEmployee2){
                BasePlusCommissionEmployee2 base = (BasePlusCommissionEmployee2) currentEmployee;
                base.setBaseSalary(1.10 * base.getBaseSalary());

                System.out.printf(
                         "new base salary with 10%% increase is: $%,.2f%n",
                         base.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
        }
    }
}
