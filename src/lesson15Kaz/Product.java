package lesson15Kaz;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Product implements Comparable<Product> {
    private String name;
    private int price;
    private ArrayList<Otziv> otzivs = new ArrayList<>();
    private ArrayList<Obzor> obzors = new ArrayList<>();

    public Product() {
    }

    public Product(String name, int price, ArrayList<Otziv> otzivs, ArrayList<Obzor> obzors) {
        this.name = name;
        this.price = price;
        this.otzivs = otzivs;
        this.obzors = obzors;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv otziv) {
        this.otzivs.add(otziv);
    }

    public ArrayList<Obzor> getObzors() {
        return obzors;
    }

    public void setObzors(Obzor obzor) {
        this.obzors.add(obzor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (otzivs != null ? !otzivs.equals(product.otzivs) : product.otzivs != null) return false;
        return obzors != null ? obzors.equals(product.obzors) : product.obzors == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        result = 31 * result + (obzors != null ? obzors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Товар{" +
                "название ='" + name + '\'' +
                ", Цена =" + price +
                ", Отзывы =" + otzivs +
                ", Обзоры =" + obzors +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price != o.price) {
            return Integer.compare(this.price, o.price);
        }
        if (this.midRate() != o.midRate()) {
            return Double.compare(this.midRate(), o.midRate());
        }
        if (this.otzivs.size() != o.otzivs.size()) {
            return Integer.compare(this.otzivs.size(), o.otzivs.size());
        }
        if (this.obzors.size() != o.obzors.size()) {
            return Integer.compare(this.obzors.size(), o.obzors.size());
        }
        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        return 0;
    }

    public double midRate() {
        int rate = 0;
        for (Otziv o : otzivs) {
            rate += o.getRate();

        }
        if (otzivs.size() > 0) {
            return rate / otzivs.size();
        } else
            return 0;
    }
}
