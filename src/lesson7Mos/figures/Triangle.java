package lesson7Mos.figures;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int perimeter() {
        if (checkTriangle(a, b, c))
            return a + b + c;
        return -1;
    }

    public static int getPerimeterTriangle(int a, int b, int c) {
        if (checkTriangle(a, b, c))
            return a + b + c;
        return -1;
    }

    public double area() {
        return getAreaTriangle(this.a, this.b, this.c);
    }

    public double getAreaTriangle(int a, int b, int c) {
        if (checkTriangle(a, b, c)) {
            double halfPerimeter = Triangle.getPerimeterTriangle(a, b, c) / 2d;
            return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        }
        return -1;
    }
    public static boolean checkTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (a + b >= c || b + c >= a || a + c >= b);
    }
}


