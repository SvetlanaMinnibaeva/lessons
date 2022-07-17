package lesson7Kaz.shop;

public class Main1 {
    public static void main(String[] args) {

        Tovar tovar1 = new Tovar("Telephone", 7000, 123321);
        Tovar tovar2 = new Tovar("Pilesos", 300, 145521);

        Otziv otziv1 = new Otziv
                ("User1", 5, "Хороший телефон", "Советую");
        Otziv otziv2 = new Otziv
                ("User1", 5, "Хороший телефон", "Берите");

        tovar1.addOtziv(otziv1);
        System.out.println();

    }
}
