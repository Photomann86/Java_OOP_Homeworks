package Seminar1_HW;

import java.utils.Arraylist;
import java.utils.List;
public class Main{
    public static void main(String[] args) {
        Product product1 = new Product();
        List<Product> products = new ArrayList<>();
        VendingMachine vendingMachine = new VendingMachine(products);
        Chocolate chocolate1 = new Chocolate("Bounty", "Nestle", 85.5, 35);
        Chocolate chocolate2 = new Chocolate("Бабаевский элитный", "Бабаевский", 100.0, 75);
        Chocolate chocolate3 = new Chocolate("Особый", "фабрика им. Крупской", 90.5, 60);
        Chocolate chocolate4 = new Chocolate("RITTER Sport", "Milk Chocolate", 120.0, 35);
        Chocolate chocolate5 = new Chocolate("RITTER Sport", "Dark Chocolate", 120.0, 50);
        Chocolate chocolate6 = new Chocolate("RITTER Sport", "Dark Chocolate", 120.0, 65);
        Chocolate chocolate7 = new Chocolate("RITTER Sport", "White Chocolate", 100.0, 0);
        Chocolate chocolate8 = new Chocolate("Алёнка", "Красный Октябрь", 99.90, 40);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);
        products.add(chocolate5);
        products.add(chocolate6);
        products.add(chocolate7);
        products.add(chocolate8);

        System.out.println("base list" +products);
        Chocolate chocolate = vendingMachine.getChocolate("Dark Chocolate","RITTER Sport", 55);
        if (chocolate != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в автомате.");
        }

        Chocolate chocolateDark = vendingMachine.getChocolate("Chocolate","Snickers", 35);
        if (chocolateDark != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateDark.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в автомате.");
        }

        Chocolate chocolateWhite = vendingMachine.getChocolate("white chocolate","Ritter", 0);
        if (chocolateWhite != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateWhite.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в автомате.");
        }
        System.out.println("final list" +products);
    }
}
    }
}