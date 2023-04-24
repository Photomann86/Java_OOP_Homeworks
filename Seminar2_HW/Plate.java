package Seminar2_HW;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food > 15) {
            System.out.println("позвал кошачью ораву поесть");
            this.food = food;
        } else {
            throw new RuntimeException("еды в мисках должно быть 15 единиц!");
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("миска: " + food);
    }

    
}
