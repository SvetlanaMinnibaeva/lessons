package lesson6Mos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tours = {{"1", "Италия", "5 дней", "самолет", "5 звезд", "120000", "полупансионат"},
                {"2", "Мексика", "15 дней", "самолет", "5 звезд", "420000", "полный пансионат"},
                {"3", "Франция, Андорра", "7 дней", "самолет", "4 звезды", "320000", "только завтрак"},
                {"4", "Грузия, Армения", "5 дней", "автобус", "3 звезды", "80000", "только завтрак"},
                {"5", "Монако", "6 дней", "самолет", "5 звезд", "600000", "полупансионат"},
                {"6", "Италия", "4 дней", "самолет", "4 звезды", "340000", "полупансионат"},
                {"7", "Иордания", "3 дней", "самолет", "4 звезды", "150000", "полупансионат"},
                {"8", "Турция", "5 дней", "самолет", "3 звезды", "200000", "полный пансионат"},
                {"9", "Турция", "14 дней", "самолет", "2 звезды", "90000", "полупансионат"},
                {"10", "Таджикистан", "9 дней", "поезд", "1 звезда", "50000", "завтраки"}};

        System.out.println("Добрый день! Выберите действие: ");

        System.out.println("1 - Узнать среднюю стоимость тура в определенную страну");
        System.out.println("2 - Узнать среднюю стоимость любого тура");
        System.out.println("3 - Вывести туры в определенную страну");
        System.out.println("4 - Вывести туры ценой ОТ и ДО");
        System.out.println("5 - Вывести туры +- 2 дня от введенной длительности в определенную страну");
        System.out.println("6 - Вывести выгодные туры(со стоимостью до 10000 в день)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("1")) {
            String country = ScannerUtils.getInputCountry();
            int averagePrice = TourUtils.getAveragePriceByCountry(tours, country);
            System.out.println("Средняя стоимость в: " + country + averagePrice);

        } else if (answer.equals("2")) {
            String country = ScannerUtils.getInputCountry();
            System.out.println("Средняя стоимость " + country + ": ");

        } else if (answer.equals("3")) {
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры в " + country + ": ");
            TourUtils.printToursByCountry(tours, country);

        } else if (answer.equals("4")) {
            int minPrice = ScannerUtils.getMinPrice();
            int maxPrice = ScannerUtils.getMaxPrice();
            TourUtils.printToursInRangePrice(tours, minPrice, maxPrice);

        } else if (answer.equals("5")) {
            String country = ScannerUtils.getInputCountry();
            int countDaysTour = ScannerUtils.getCountDaysTour();
            TourUtils.printDurationOfTourPlusMinusTwoDays(tours, countDaysTour);
        }
    }
}