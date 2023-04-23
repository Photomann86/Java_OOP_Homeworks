package Seminar1_HW;
public class Main{
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new BottleOfWater("минералка", "Borjomi", 70.5, 0.5));
        vm.addProduct(new BottleOfMilk("молоко", "Простоквашино", 70.99, 0.9, 3.2));
        vm.addProduct(new Chocolate("Аленка", "Красный октябрь", 40.33, 35));
        vm.addProduct(new BubbleGum("жевательная резинка", "ORBIT", 56.50, 10));

        System.out.println(vm);
    }
}
