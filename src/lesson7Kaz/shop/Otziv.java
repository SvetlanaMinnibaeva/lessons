package lesson7Kaz.shop;

import java.sql.Driver;

public class Otziv {
    private String user;
    private double rating;
    private String mainComent;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMainComent() {
        return mainComent;
    }

    public void setMainComent(String mainComent) {
        this.mainComent = mainComent;
    }

    public String getDostoinstva() {
        return dostoinstva;
    }

    public void setDostoinstva(String dostoinstva) {
        this.dostoinstva = dostoinstva;
    }

    private String dostoinstva;

    public Otziv(String user, double rating, String mainComent, String dostoinstva) {
        this.user = user;
        this.rating = rating;
        this.mainComent = mainComent;
        this.dostoinstva = dostoinstva;
    }
}
