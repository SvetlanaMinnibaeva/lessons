package lesson5Mos;

public class lesson5 {
    public static void main(String[] args) {
        MathOperations.printTypeOfTriangle(2, 4, 5);
        MathOperations.printTypeOfTriangle(4, 4, 4);
        double areaOfTriangle = MathOperations.areaOfTriangle(2, 4, 3);
        double areaOfTriangle1 = MathOperations.areaOfTriangle(4,6);
        if (areaOfTriangle > areaOfTriangle1) {
            System.out.println("Первый треугольник больше!");
        } else if (areaOfTriangle < areaOfTriangle1) {
            System.out.println("Второй треугольник больше!");
        } else {
            System.out.println("Треугольники равны");
        }
        double areaOfTriangle2 = MathOperations.areaOfTriangle(4,8);
        System.out.println(areaOfTriangle2);
    }
}
