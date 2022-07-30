package lesson15Kaz;

import java.util.Comparator;

public class SortProductOtzivsFromTo implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o2.getOtzivs().size() != o1.getOtzivs().size()) {
            return Integer.compare(o2.getOtzivs().size(), o1.getOtzivs().size());
        }
        if (o2.midRate() != o1.midRate()) {
            return Double.compare(o2.midRate(), o1.midRate());
        }
        if (o1.getPrice() != o2.getPrice()) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
        if (o2.getOtzivs().size() != o1.getOtzivs().size()) {
            return Integer.compare(o2.getOtzivs().size(), o1.getOtzivs().size());
        }
        if (o1.getObzors().size() != o2.getObzors().size()) {
            return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
        }
        if (!o2.getName().equals(o1.getName())) {
            return o2.getName().compareTo(o1.getName());
        }
        return 0;
    }
}
