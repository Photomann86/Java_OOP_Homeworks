package Seminar2_HW;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Мех", 20),
            new Cat("Мурзик", 25),
            new Cat("Ириска", 30),
            new Cat("Базилио", 15),
            new Cat("Муська", 25),
            new Cat()
    };
    Plate plate = new Plate(100);
    plate.info();
    Owner owner = new Owner("Margo", 33);
    while (!owner.checkCats(cats)){
        for (Cat cat:cats) {
            cat.eat(plate);
            plate.info();
        }
            owner.makeFood(plate,owner.checkCats(cats));
    }
    System.out.println("All cats are full!");
    }
    
}
