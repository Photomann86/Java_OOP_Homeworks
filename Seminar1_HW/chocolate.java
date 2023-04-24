package Seminar1_HW; 

public class Chocolate extends Product{
    
    int CocoaContent;

    public Chocolate(String name, String brand, double price, int CocoaContent) {
        super(name, brand, price);
        this.CocoaContent = CocoaContent;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", содержание какао: %s", this.CocoaContent);
    }

}