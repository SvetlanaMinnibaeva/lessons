package lesson7Mos.figures;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double perimeter() {
        if (this.radius <= 0)
            return -1;
        return 2 * Math.PI * this.radius;
    }

    public double area() {
        if (this.radius <= 0)
            return -1;
        return Math.PI * this.radius * this.radius;
    }
}


