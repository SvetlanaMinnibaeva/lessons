package lesson7Kaz.shop;

import lesson7Kaz.shop.Otziv;

public class Tovar {
    private String name;
    private int price;
    private int cod;

    private Otziv[] otziv = new Otziv[1000];

    public Tovar(String name, int price, int cod) {
        this.name = name;
        this.price = price;
        this.cod = cod;
    }

        public void addOtziv (Otziv otziv){
            int col = 0;
            for (int i = 0; i < this.otziv.length; i++) {
                if (this.otziv[i] == null) {
                    this.otziv[i] = otziv;
                    col = i;
                    break;
                }
            }
            //System.out.println("Место закончилось");
            System.out.println("Количество свободных отзывов " + (this.otziv.length - col - 1));
        }


}
