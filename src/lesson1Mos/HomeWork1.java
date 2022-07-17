package lesson1Mos;

public class HomeWork1 {
    public static void main(String[] args) {
        double money = 1000.00;
        double pizzaPrice = 230.00;
        double gumPrice = 26.00;
        double candyPrice = 2.50;
        int pizzaCount = (int) (money / pizzaPrice);
        double restOfMoney1 = money % pizzaPrice;
        int gumCount = (int) (restOfMoney1 / gumPrice);
        double restOfMoney2 = restOfMoney1 % gumPrice;
        int candyCount = (int) (restOfMoney2 / candyPrice);
        double restOfMoney3 = restOfMoney2 % candyPrice;
        System.out.println("На суммy " + String.format("%.2f",money) + " руб. мы можем купить: " + "\n- " + pizzaCount
                + " пиццы, " + "\n- " + gumCount + " жевачки," + "\n- " + candyCount + " конфет."
                + "\n" + "Сдача с магазина: " + String.format("%.2f",restOfMoney3) + " руб.");
    }
}
