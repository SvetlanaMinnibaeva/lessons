package lesson7Kaz.blackJack;

public class Karta {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Karta(String name, int value){
        this.value = value;
        this.name = name;
    }

}
