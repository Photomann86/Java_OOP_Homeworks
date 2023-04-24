package Seminar2_HW;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        if (name.isEmpty()) {
            throw new RuntimeException("Cat must have name!");
        } else {
            this.name = name;
        }
        if (appetite > 9) {
            this.appetite = appetite;
        } else {
            throw new RuntimeException("Appetite must be more 9!");
        }
        this.full = false;
    }

    public Cat(String name) {
        this(name, 15);
    }

    public Cat() {
        this("Bob",15);
    }

    public boolean getFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood() && !full) {
            System.out.println(name + " поедает корм");
            plate.setFood(plate.getFood() - appetite);
            System.out.println(name + " ест! " + name + " с полным пузом еды!");
            full = true;
        } else if (full) {
            System.out.println(name + " наелся от пуза!");

        } else {
            System.out.println(name + " миска пуста, хозяин! Что за дела?!");
            System.out.println(name+": Mяy Mяy Mяy!");
        }
    }

    public String getInfo() {
        if (full) return name + " is full!";
        else return name + " is hungry!";
    }
    
}
