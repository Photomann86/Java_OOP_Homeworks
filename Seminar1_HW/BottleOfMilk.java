package Seminar1_HW;

public class BottleOfMilk extends Product {
    double fat;
    double volume;

    public BottleOfMilk(String name, String brand, double price, double volume, double fat) {
        super(name, brand, price);
        this.fat = fat;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", volume : %s, fat: %s", this.volume, this.fat);
    }
    
}
