package Seminar1_HW;
public class BottleOfWater extends Product{
    
    double volume;

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("name: %s, brand: %s, price: %f, volume: %f", this.volume);
    }
}
