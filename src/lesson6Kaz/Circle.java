package lesson6Kaz;

public class Circle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double perimeter() {
        if(this.radius <= 0)
            return -1;
        return 2 * Math.PI * this.radius;
    }

    public double area() {
        if(this.radius <= 0)
            return -1;
        return Math.PI * this.radius * this.radius;
    }
}
