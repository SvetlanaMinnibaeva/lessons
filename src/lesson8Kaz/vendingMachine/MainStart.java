package lesson8Kaz.vendingMachine;

public class MainStart {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Product lays = new Product("Lays", 55, 5);
        Product snickers = new Product("Snickers", 46, 20);
        Product pepsi = new Product("Pepsi", 65, 13);
        Product sprite = new Product("Sprite", 55, 14);
        Product iceTea = new Product("Iced Tea", 45, 1);

        vendingMachine.getProducts().add(lays);
        vendingMachine.getProducts().add(snickers);
        vendingMachine.getProducts().add(pepsi);
        vendingMachine.getProducts().add(sprite);
        vendingMachine.getProducts().add(iceTea);

        vendingMachine.setTotalMoney(50);
        vendingMachine.start();
    }
}
