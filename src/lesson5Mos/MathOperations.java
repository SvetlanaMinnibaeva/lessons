package lesson5Mos;

public class MathOperations {
    /**
     * 1 - модификатор доступа (регулировка области видимости данного метода)
     * public - доступ внутри всего проекта
     * private - доступ внутри текущего файла
     * _______ - доступ внутри текущего пакета (папки) и наследникам данного файла
     * protected - доступ внутри текущего файла и наследникам данного файла
     * <p>
     * 2 - static (или есть или нет)
     * 3 - возвращаемый тип (void или тип )
     * 4 - название метода
     * 5 - входящие параметры
     * 6 - тело выполнения метода
     */
    public static void printTypeOfTriangle(int a, int b, int c) {
        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Такого треугольника не существует");
            return;
        }
        if (a == b && b == c && c == a) {
            System.out.println("Равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }

    public static double areaOfTriangle(int a, int b, int c) {
        double p = 0.5 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static double areaOfTriangle(int osnovanie, int visota) {
        return 0.5 * osnovanie * visota;
    }
}
