package lesson7Kaz.vkontakte;

public class Date {
    final private int day;
    final private int month;
    final private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDateAsString() {
        return day + "." + month + "." + year;
    }
}
