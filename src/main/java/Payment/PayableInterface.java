package Payment;

public class PayableInterface {
    public static void main(String[] args) {

        Payable[] payables = new Payable[]{
                new Invoice("1224","seat", 2, 375.00),
                new Invoice("4321", "tire", 4, 79.95),
                new SalariedEmployee("john","smith","113-2464-3562",4000),
                new SalariedEmployee("yahaya","musa","2435-764-345",3000)
        };

        for(Payable currentPayable : payables){
            System.out.printf("%n%s %nPayment due: $%,.2f%n",
                    currentPayable.toString(), currentPayable.getPayment());
        }
    }

}
