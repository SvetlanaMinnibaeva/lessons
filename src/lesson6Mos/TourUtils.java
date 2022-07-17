package lesson6Mos;

public class TourUtils {
    public static int getAveragePriceByCountry(String[][] tours, String countryBy) {

        int allPricesByCountry = 0;
        int countTours = 0;
        for (int i = 0; i < tours.length; i++) {
            String countriesFromCurrentTour = tours[i][1];
            countriesFromCurrentTour = countriesFromCurrentTour.replaceAll(",", " ");
            String[] countries = countriesFromCurrentTour.split(" ");
            // проверили наличие страны в туре
            if (TourUtils.findCountry(countries, countryBy)) {
                //считаем кол-во туров с такой страной
                countTours++;
                //наращиваем на переменную стоимости туров
                allPricesByCountry = allPricesByCountry + Integer.parseInt(tours[i][5]);
            }
        }
        return allPricesByCountry / countTours;
    }

    private static boolean findCountry(String[] countries, String countryBy) {
        for (String c : countries) {
            if (countryBy.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            String countriesFromCurrentTour = tours[i][1];
            countriesFromCurrentTour = countriesFromCurrentTour.replaceAll(",", " ");
            String[] countrs = countriesFromCurrentTour.split(" ");
            if (TourUtils.findCountry(countrs, country)) {


            }
        }
    }

    private static void printTour(String[][] tours, int i) {
        System.out.printf("Тур: %s, за %s рублей, %s звезды, на %s ночей, %s, %s \n", tours[i][1], tours[i][5], tours[i][4], tours[i][3], tours[i][6]);

    }

    public static void printToursInRangePrice(String[][] tours, int min, int max) {
        System.out.println("Туры в диапозоне цен от " + min + " до " + max);
        for (int i = 0; i < tours.length; i++) {
            if (min <= Integer.parseInt(tours[i][5]) && Integer.parseInt(tours[i][5]) <= max) {
                for (int j = 0; j < tours[i].length; j++) {
                    System.out.print(tours[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void printDurationOfTourPlusMinusTwoDays(String[][] tours, int countDaysTour) {
        System.out.println("Туры +- 2 дня от желаемой длительности: ");
        for (int i = 0; i < tours.length; i++) {
            if (Integer.parseInt(tours[i][2].replaceAll("^0-9", "")) - 2 <= countDaysTour
                    && countDaysTour <= Integer.parseInt(tours[i][2].replaceAll("^0-9", "")) + 2) {
                for (int j = 0; j < tours[i].length; j++) {
                    System.out.print(tours[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}