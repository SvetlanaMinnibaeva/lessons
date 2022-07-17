package lesson8Kaz.vendingMachine;

import java.security.PublicKey;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int choice;

    public void admin() {
        System.out.println("АДМИНИСТРАТОР");
        System.out.println("1 - ПРОВЕРИТЬ ПРОДУКТЫ");
        System.out.println("2 - ПРОВЕРИТЬ ДЕНЬГИ");
        System.out.println("3 - ДОБАВИТЬ ДЕНЬГИ");
        System.out.println("4 - ДОБАВИТЬ КОЛИЧЕСТВО ПРОДУКТА");
        System.out.println("5 - ДОБАВИТЬ НОВЫЙ ПРОДУКТ");
        System.out.println("0 - ВЕРНУТЬСЯ НАЗАД");

    }

    public void user() {
        System.out.println("ПОЛЬЗОВАТЕЛЬ");
        System.out.println("1 - ВНЕСИТЕ ДЕНЬГИ");
        System.out.println("2 - ВЕРНУТЬ ДЕНЬГИ");
        System.out.println("3 - ВЫБЕРИТЕ ПРОДУКТ");
        System.out.println("0 - ВЕРНУТЬСЯ НАЗАД");
    }
}

