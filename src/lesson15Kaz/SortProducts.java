package lesson15Kaz;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortProducts {
    public static TreeSet<Product> sortProductRateFromTo(Set<Product> products) {
        TreeSet<Product> retProduct = new TreeSet<>(new SortProductRateFromTo());
        for (Product p: products) {
            retProduct.add(p);
        }
        return retProduct;
    }

    public static TreeSet<Product> sortProductNameFromTo(Set<Product> products){
        TreeSet<Product> retProduct = new TreeSet<>(new SortProductNameFromTo());
        for (Product p: products) {
            retProduct.add(p);
        }
        return retProduct;
    }

    public static TreeSet<Product> sortProductOtzivsFromTo(Set<Product> products){
        TreeSet<Product> retProduct = new TreeSet<>(new SortProductOtzivsFromTo());
        for (Product p: products) {
            retProduct.add(p);
        }
        return retProduct;
    }
}
