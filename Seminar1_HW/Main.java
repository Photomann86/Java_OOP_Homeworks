package Seminar1_HW;
public class Main{
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new BottleOfWater("минералка", "Borjomi", 0.5, 70));
        vm.addProduct(new BottleOfMilk("молоко", "Простоквашино", 70, 0.9, 3.2));
        vm.addProduct(new Chocolate("Аленка", "Красный октябрь", 40, 35));

        System.out.println(vm);
    }
}
