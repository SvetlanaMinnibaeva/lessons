package lesson6Kaz;

public class Tetrahedron {
    private double a;
    private double b;
    private double c;
    private double height;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double tetrahedronVolume() {
        if(this.a <= 0 || this.b <= 0 || this.c <= 0 || this.height <= 0)
            return  -1;
        double S = Triangle.getAreaTriangle(this.a, this.b, this.c);
        return (S * this.height) / 3;
    }

}
