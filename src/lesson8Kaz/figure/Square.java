package lesson8Kaz.figure;

public class Square extends Figure{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public Square() {
    }

    @Override
    public void printArea() {
        System.out.println("Площадь");;
    }

    @Override
    public void printVolume() {
        System.out.println("Объем");

    }
}
