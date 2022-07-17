package lesson2Mos;

public class HomeWork2arr {
    public static void main(String[] args) {
        System.out.println("1) Только четные от -100 до -50");
        int[] arr = new int[51];
        for (int i = 0; i <= 50; ++i) {
            arr[i] = i - 100;
            if ((i - 100) % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("2) Все числа в обратном порядке от 10 до 30");
        int[] arr1 = new int[21];
        for (int i = 20; i >= 0; --i) {
            arr1[i] = i + 10;
            System.out.println(arr1[i]);
        }
        System.out.println("3) Кол-во четных чисел в диапазоне от 30 до 61");
        int[] arr2 = new int[32];
        int count = 0;
        for (int i = 0; i <= 31; i++) {
            arr2[i] = i + 30;
            if (arr2[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("4) *** Посчитать сколько нужно лет, " +
                "чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500 ");
        int month = 0;
        for (int i = 0; i <= 200000; i += 9500) {
            month++;
        }
        System.out.println("Лет: " + month / 12 + "\nМесяцев: " + month % 12);
        System.out.println("5) Вывести на консоль все числа от 20 до 60, пропуская " +
                "диапазон от 30 до 40 включительно)");
        int[] arr3 = new int[41];
        for (int i = 0; i <= 40; i++) {
            arr3[i] = i + 20;
            if (!(30 <= arr3[i] && arr3[i] <= 40)) {
                System.out.println(arr3[i]);
            }
        }
    }
}


