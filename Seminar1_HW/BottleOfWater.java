package Seminar1_HW;
public class BottleOfWater extends Product{
    
    double volume;

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", volume: %f", this.volume);
    }
}
