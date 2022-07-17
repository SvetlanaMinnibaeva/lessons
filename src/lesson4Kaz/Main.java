package lesson4Kaz;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"Турция", "60", "3 звезды", "Самолет", "3 раза"},
                {"Турция", "70", "4 звезды", "Самолет", "2 раза"},
                {"Египет", "50", "5 звезды", "Самолет", "3 раза"},
                {"Дагестан", "60", "3 звезды", "Поезд", "4 раза"},
                {"Дагестан", "80", "3 звезды", "Поезд", "4 раза"},
                {"Дагестан", "100", "3 звезды", "Поезд", "1 раз"}};
        Ture.getCountry(arr, "Турция");
        Ture t = new Ture();
        Ture.getCountry(arr, "Турция", 65);
        Ture.getPrCountry(arr, 50, 70);
        System.out.println(Calc.getDivision(9, 0));
        int a = 0;
        System.out.println(9 / a);
    }
}
