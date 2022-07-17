package lesson8Kaz.figure;

public class Circle extends Figure {
    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь круга");;
    }

    @Override
    public void printVolume() {
        System.out.println("O");;
    }
}
