package lesson15Kaz;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Компьютер", 50000);
        Product product1 = new Product("Мышь", 750);
        Product product2 = new Product("Ноутбук", 70000);
        Product product3 = new Product("Ведро", 123);
        Product product4 = new Product("Мотоцикл", 200000);

        Otziv otziv  =new Otziv(4, "нормально");
        Otziv otziv1  =new Otziv(5,"отлично");
        Otziv otziv2  =new Otziv(2,"Плохо");
        Otziv otziv3  =new Otziv(3,"так себе");
        Otziv otziv4  =new Otziv(1,"ужасно");

        product.setOtzivs(otziv);
        product.setOtzivs(otziv1);
        product2.setOtzivs(otziv2);
        product3.setOtzivs(otziv3);
        product3.setOtzivs(otziv4);

        Obzor obzor = new Obzor("Огонь");
        product3.setObzors(obzor);

        TreeSet<Product>products = new TreeSet<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        for (Product p: products) {
            System.out.println(p);
        }
        TreeSet<Product> sortProduct = SortProducts.sortProductRateFromTo(products);
        System.out.println();

        for (Product p: sortProduct) {
            System.out.println(p);
        }

        System.out.println();
        SortProducts.sortProductNameFromTo(products);
        for (Product p: sortProduct) {
            System.out.println(p);
        }

        System.out.println();
        SortProducts.sortProductOtzivsFromTo(products);
        for (Product p: sortProduct) {
            System.out.println(p);
        }

    }
}
