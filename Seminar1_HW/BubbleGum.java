package Seminar1_HW;

public class BubbleGum extends Product {
    int quantitySlices;

    public BubbleGum(String name, String brand, double price, int quantitySlices){
        super(name, brand, price);
        this.quantitySlices = quantitySlices;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(", количество пластинок: %d", this.quantitySlices);
    }

}
