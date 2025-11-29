package Payment;

public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        if(quantity < 0.0){
            throw new IllegalArgumentException("quantity must be >= 0.0");
        }
        if(pricePerItem < 0.0){
            throw new IllegalArgumentException("price per item must be >= 0.0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return String.format("%s %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "invoice", "part number",
                getPartNumber(), getPartDescription(), "quantity", getQuantity(), " price per item", getPricePerItem());
    }

    @Override
    public double getPayment() {
        return getQuantity() * getPricePerItem();
    }
}
