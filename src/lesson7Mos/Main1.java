package lesson7Mos;

import lesson7Mos.figures.Triangle;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setA(7);
        triangle.setB(5);
        triangle.setC(10);

        Triangle triangle2 = new Triangle(5,5,6);
        triangle2.setA(5);
        triangle2.setB(5);
        triangle2.setC(6);

        System.out.println(triangle.perimeter());
        System.out.println(triangle2.perimeter());
    }
}
