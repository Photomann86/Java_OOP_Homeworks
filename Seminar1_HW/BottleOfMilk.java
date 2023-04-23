package Seminar1_HW;

public class BottleOfMilk extends Product {
    double fat;
    double volume;

    public BottleOfMilk(String name, String brand, double price, double volume, double fat) {
        super(name, price);
        this.fat = fat;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("name: %s, brand: %s, volume : %f, fat: %f", this.volume, this.fat);
    }
    
}
