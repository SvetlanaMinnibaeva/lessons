package lesson8Kaz.vendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private double totalMoney = 0;
    private double userMoney = 0;
    private List<Product> products = new ArrayList<>();

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void addMoney(double money) {
        this.totalMoney = this.totalMoney + money;
    }

    public double getUserMoney() {
        return userMoney;
    }

    public void addUserMoney(double money) {
        this.userMoney += money;
    }

    public void addNewProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("НАПИШИТЕ НАЗВАНИЕ НОВОГО ПРОДУКТА, КОТОРЫЙ ХОТИТЕ ДОБАВИТЬ");
        String name = sc.nextLine();
        System.out.println("ВВЕДИТЕ ЦЕНУ НОВОГО ПРОДУКТА");
        double price = sc.nextDouble();
        System.out.println("ВВЕДИТЕ КОЛИЧЕСТВО НОВОГО ПРОДУКТА");
        int quantity = sc.nextInt();
        products.add(new Product(name, price, quantity));
    }

    public void resetUserCoins() {
        System.out.println("ВОЗВРАЩЕНО - " + this.userMoney + "₽");
        this.userMoney = 0.0;
    }

    public double change(double price) {
        double change = this.userMoney - price;
        this.totalMoney = this.totalMoney + this.userMoney;
        this.totalMoney = this.totalMoney - change;
        this.userMoney = 0;
        System.out.println(change + "₽ СДАЧА");

        return change;
    }

    public void buy(Product product) {
        if (getUserMoney() >= product.getProductPrice()) {
            product.sellProduct();
            change(product.getProductPrice());
        } else {
            System.out.println("ВНЕСЁННОЙ СУММЫ НЕДОСТАТОЧНО");
        }
    }

    public void showProductList() {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + " - " + product.getProductName() + " - ЦЕНА: " +
                    product.getProductPrice() + "₽ КОЛИЧЕСТВО " +
                    product.getProductQuantity());
        }
    }

    public void comeBack() {

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean loop = true;

        while (loop) {
            System.out.println("1 - АДМИНИСТРАТОР");
            System.out.println("2 - ПОЛЬЗОВАТЕЛЬ");
            System.out.println("0 - ВЫХОД");
            choice = scanner.nextInt();
            boolean loopAdmin = true;
            boolean loopUser = true;


            if (choice == 1) {
                while (loopAdmin) {
                    new Menu().admin();
                    int choiceAdmin = scanner.nextInt();

                    if (choiceAdmin == 1) {
                        showProductList();
                        System.out.println("НАЖМИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                        if (scanner.nextInt() == 0)
                            continue;

                    } else if (choiceAdmin == 2) {
                        System.out.println(getTotalMoney() + "₽");
                        System.out.println("НАЖМИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                        if (scanner.nextInt() == 0)
                            continue;

                    } else if (choiceAdmin == 3) {
                        System.out.println("ВНЕСИТЕ ДЕНЬГИ");
                        double money = scanner.nextInt();
                        addMoney(money);
                        System.out.println("В АВТОМАТЕ " + getTotalMoney() + "₽");
                        System.out.println("НАЖМИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                        if (scanner.nextInt() == 0)
                            continue;

                    } else if (choiceAdmin == 4) {
                        showProductList();
                        System.out.println("ВЫБЕРИТЕ ПРОДУКТ, КОТОРЫЙ НУЖНО ДОБАВИТЬ");
                        choiceAdmin = scanner.nextInt();
                        Product product = products.get(choiceAdmin - 1);
                        System.out.println("ВВЕДИТЕ КОЛИЧЕСТВО, КОТОРОЕ НУЖНО ДОБАВИТЬ");
                        choiceAdmin = scanner.nextInt();
                        product.setProductQuantity(product.getProductQuantity() + choiceAdmin);
                        showProductList();
                        System.out.println("НАЖМИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                        if (scanner.nextInt() == 0)
                            continue;

                    } else if (choiceAdmin == 5) {
                        addNewProduct();
                        showProductList();
                        System.out.println("НАЖМИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                        if (scanner.nextInt() == 0)
                            continue;

                    } else if (choiceAdmin == 0) {
                        loopAdmin = false;
                        break;
                    }
                }


            } else if (choice == 2) {
                while (loopUser) {
                    new Menu().user();
                    int choiceUser = scanner.nextInt();
                    if (choiceUser == 1) {
                        System.out.println("ВНЕСИТЕ ДЕНЬГИ В ПРИЕМНИК: 1₽, 2₽, 5₽, 10₽, 50₽");
                        System.out.println("НАЖМИТЕ 0 ДЛЯ ЗАВЕРШЕНИЯ");
                        while (choiceUser != 0) {
                            choiceUser = scanner.nextInt();
                            int money = choiceUser;
                            if (money != 1 && money != 2 && money != 5 && money != 10 && money != 50) {
                                System.out.println("МОНЕТЫ НЕДЕЙСТВИТЕЛЬНЫ");
                            } else {
                                addUserMoney(money);
                            }
                            System.out.println(getUserMoney());
                        }

                    } else if (choiceUser == 2) {
                        resetUserCoins();
                        System.out.println("ВВЕДИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                        if (scanner.nextInt() == 0)
                            continue;

                    } else if (choiceUser == 3) {
                        showProductList();
                        choiceUser = scanner.nextInt();
                        buy(products.get(choiceUser - 1));
                        System.out.println("ВВЕДИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                        if (scanner.nextInt() == 0)
                            continue;

                    } else if (choiceUser == 0) {
                        loopUser = false;
                        break;
                    }
                }


            } else if (choice == 0) {
                System.out.println("ВЫКЛЮЧЕНИЕ");
                loop = false;
                break;
            } else {
                System.out.println("НЕПРАВИЛЬНЫЙ ВЫБОР");
                System.out.println("ВВЕДИТЕ 0, ЧТОБЫ ВЕРНУТЬСЯ НАЗАД");
                if (scanner.nextInt() == 0)
                    continue;
            }
        }
    }
}




