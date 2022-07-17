package lesson2Mos;

public class Lesson2 {
    public static void main(String[] args) {
        int mark = 6;
        switch (mark) {
            case 5:
                System.out.println("Отлично!");
                break;
            case 4:
                System.out.println("Хорошо!");
                break;
            case 3:
                System.out.println("Не очень");
                break;
            case 2:
                System.out.println("Иди учить!");
                break;
            default:
                System.out.println("Это не оценка");

        }
    }
}
