package Seminar1_HW;

public class Product {

    String name;
    String brand;
    double price;

    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Product(String name, double price) {
    }

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, price: %f", this.name, this.brand, this.price);
    }
    }
