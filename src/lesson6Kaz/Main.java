package lesson6Kaz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру");
        System.out.println("1 - треугольник");
        System.out.println("2 - круг");
        System.out.println("3 - параллелограмм");
        System.out.println("4 - конус");
        System.out.println("5 - овал");
        System.out.println("6 - тетраэдр");

        Scanner sc = new Scanner(System.in);
        int numFigure = sc.nextInt();

        switch (numFigure) {
            case 1:
                System.out.println("Введите сторону треугольника AB");
                int ab = sc.nextInt();
                System.out.println("Введите сторону треугольника BC");
                int bc = sc.nextInt();
                System.out.println("Введите сторону треугольника CD");
                int ac = sc.nextInt();
                if (Triangle.getCheckTriangle(ab, bc, ac)) {
                    Triangle tr = new Triangle();
                    tr.setAB(ab);
                    tr.setBC(bc);
                    tr.setAC(ac);
                    System.out.println("Периметр треугольника = " + tr.perimeterTriangle());
                    System.out.println("Площадь треугольника = " + tr.areaTriangle());
                } else {
                    System.out.println("Такого треугольника не существует. Введите параметры заново.");
                }
                break;

            case 2:
                System.out.println("Введите радиус круга");
                int radius = sc.nextInt();
                while (radius <= 0) {
                    System.out.println("Радиус должен быть больше нуля. Введите правильное значение.");
                    radius = sc.nextInt();
                }
                Circle circ = new Circle();
                circ.setRadius(radius);
                System.out.println("Периметр круга = " + circ.perimeter());
                System.out.println("Площадь круга = " + circ.area());
                break;

            case 3:
                System.out.println("Ввeдите сторону AB");
                double ab1 = sc.nextDouble();
                System.out.println("Введите сторону BC");
                double bc1 = sc.nextDouble();
                System.out.println("Введите сторону CD");
                double cd1 = sc.nextDouble();
                System.out.println("Введите сторону AD");
                double ad1 = sc.nextDouble();
                if (Parallelogramm.checkParallelogramm(ab1, bc1, cd1, ad1)) {
                    System.out.println("Введите угол между сторонами AB и AD");
                    double angleA = sc.nextDouble();
                    Parallelogramm par = new Parallelogramm();
                    par.setAb(ab1);
                    par.setBc(bc1);
                    par.setCd(cd1);
                    par.setAd(ad1);
                    System.out.println("Периметр параллелограмма = " + par.getPerimeter());
                    System.out.println("Площадь параллелограмма = " + par.getArea());
                } else {
                    System.out.println("Это не параллелограмм!");
                }
                break;

            case 4:
                System.out.println("Введите радиус основания конуса");
                double rad = sc.nextDouble();
                System.out.println("Введите высоту конуса");
                double h = sc.nextDouble();
                Cones cones = new Cones();
                cones.setRadius(rad);
                cones.setHeight(h);
                System.out.println("Oбъем кругового конуса = " + cones.coneVolume());
                System.out.println("Oбщая площадь поверхности конуса = " + cones.totalSurfaceArea());
                break;

            case 5:
                System.out.println("Введите большую полуось овала");
                double x = sc.nextDouble();
                System.out.println("Введите малую полуось овала");
                double y = sc.nextDouble();
                Oval oval = new Oval();
                oval.setBigSemiaxis(x);
                oval.setSmallSemiaxis(y);
                System.out.println("Площадь овала = " + oval.getAreaOval());
                break;

            case 6:
                System.out.println("Введите длину ребра основания тетраэдра a");
                double a = sc.nextDouble();
                System.out.println("Введите длину ребра основания тетраэдра b");
                double b = sc.nextDouble();
                System.out.println("Введите длину ребра основания тетраэдра c");
                double c = sc.nextDouble();
                System.out.println("Введите длину высоты опущенной на основание тетраэдра");
                double height = sc.nextDouble();
                Tetrahedron tetrahedron = new Tetrahedron();
                tetrahedron.setA(a);
                tetrahedron.setB(b);
                tetrahedron.setC(c);
                tetrahedron.setHeight(height);
                System.out.println("Объем тетраэдра = " + tetrahedron.tetrahedronVolume());
                break;
            default:
                System.out.println("Неверное число");
        }

    }
}
