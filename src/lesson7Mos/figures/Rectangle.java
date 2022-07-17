package lesson7Mos.figures;

public class Rectangle {
    int a;
    int b;
    int c;
    int d;

    public Rectangle() {
    }

    public Rectangle(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int perimeter() {
        if (checkRectangle(a, b, c, d))
            return a + b + c + d;
        return -1;
    }

    public int area() {
        if (checkRectangle(a, b, c, d))
            return a * b;
        return -1;
    }

    public static boolean checkRectangle(int a, int b, int c, int d) {
        return a > 0 && b > 0 && c > 0 && d > 0 && (a == c && b == d);
    }
}
