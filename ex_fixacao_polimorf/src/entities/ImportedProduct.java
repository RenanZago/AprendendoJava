package entities;

public class ImportedProduct extends Product{
    private double customsFee;
    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag(){
        return getName() + " - $ " + String.format("%.2f",totalPrice()) + " (Customs fee: $ " + String.format("%.2f",getCustomsFee()) + ")";
    }

    public double totalPrice(){
        return getPrice() + getCustomsFee();
    }
}
