package lesson7Mos.figures;

public class MainFigures {
    public static void main(String[] args) {
        Circle circle = new Circle(9.6);
        System.out.println("Периметр круга = " + circle.perimeter() + ", площадь круга = " + circle.area());

        Triangle triangle = new Triangle(7, 6, 8);
        System.out.println("Периметр треугольника = " + triangle.perimeter() + ", площадь треугольника = "
                + triangle.area());

        Rectangle rectangle = new Rectangle(4, 5, 4, 5);
        System.out.println("Периметр прямоугольника = " + rectangle.perimeter() + ", площадь прямоугольника = "
                + rectangle.area());

    }
}
