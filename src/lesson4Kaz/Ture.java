package lesson4Kaz;

public class Ture {
    public static void getCountry(String[][] str, String country) {
        for (int i = 0; i < str.length; i++) {
            System.out.printf((str[i][0] == country ? "Страна %s , стоимость %s, звезд %s, добираться %s, кормят " +
                    " %s\n" : ""), str[i][0], str[i][1], str[i][2], str[i][3], str[i][4]);
        }
    }

    public void delCountry(String[][] str, String country) {

    }

    public static void getCountry(String[][] str, String country, int max) {
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i][1]) < max)
                System.out.printf((str[i][0] == country ? "Страна %s , стоимость %s, звезд %s, добираться %s, кормят " +
                        " %s\n" : ""), str[i][0], str[i][1], str[i][2], str[i][3], str[i][4]);
        }
    }

    public static void getPrCountry(String[][] str, int min, int max) {
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i][1]) >= min && Integer.parseInt(str[i][1]) <= max) {
                System.out.printf(( "Страна %s , стоимость %s, добираться %s, кормят " +
                        " %s\n"), str[i][0], str[i][1], str[i][3], str[i][4]);
            }
        }
    }
}