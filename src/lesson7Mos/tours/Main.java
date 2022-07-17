package lesson7Mos.tours;

public class Main {
    public static void main(String[] args) {

        Tour tour1 = new Tour(1, 5, "самолет", 5, 120000, "полупансионат");
        Tour tour2 = new Tour(2, 15, "самолет", 5, 420000, "полный полупансионат");
        Tour tour3 = new Tour(3, 7, "самолет", 4, 320000, "только завтрак");

        tour1.addCountry("Италия");
        tour2.addCountry("Мексика");
        tour3.addCountry("Франция");
        tour3.addCountry("Андорра");
    }
}
