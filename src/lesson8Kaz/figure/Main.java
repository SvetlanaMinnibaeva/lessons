package lesson8Kaz.figure;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Square square1 = new Square(4);
        Square square2 = new Square(6);

        Figure[] figures = new Figure[4];

        figures[0] = circle1;
        figures[1] = circle2;
        figures[2] = square1;
        figures[3] = square2;

        for(Figure f: figures){
            f.printArea();
            f.printVolume();
        }

    }
}
