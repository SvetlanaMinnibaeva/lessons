package lesson6Mos;

import java.util.Scanner;

public class ScannerUtils {
    public static String getInputCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну поездки: ");
        String country = scanner.nextLine();
        return country;
    }

    public static int getMinPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальную стоимость тура");
        int minPrice = Integer.parseInt(sc.nextLine());
        return minPrice;
    }

    public static int getMaxPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальную стоимость тура");
        int maxPrice = Integer.parseInt(sc.nextLine());
        return maxPrice;
    }

    public static int getCountDaysTour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемую длительность тура");
        int countDaysTour = Integer.parseInt(sc.nextLine());
        return countDaysTour;
    }
}
