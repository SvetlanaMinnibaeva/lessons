package lesson2Mos;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("1) Только четные от -100 до -50");
        for (int i = -100; i <= -50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("2)Все числа в обратном порядке от 10 до 30");
        for (int i = 30; i >= 10; i--) {
            System.out.println(i);
        }
        System.out.println("3) Кол-во четных чисел в диапазоне от 30 до 61");
        int count = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("4) *** Посчитать сколько нужно лет, чтоб собрать сумму " +
                "в 200т рублей,если откладывать ежемесячно по 9500т");
        int countMonth = 0;
        int i = 0;
        while (i <= 200000) {
            i += 9500;
            countMonth++;
        }
        System.out.println("Лет: " + countMonth / 12 + "\nМесяцев: " + countMonth % 12);
        System.out.println("5) Вывести на консоль все числа от 20 до 60, " +
                "пропуская диапазон от 30 до 40 включительно");
        for (int j = 20; j <= 60; j++) {
            if (30 <= j && j <= 40)
                continue;
            System.out.println(j);
        }
    }
}




