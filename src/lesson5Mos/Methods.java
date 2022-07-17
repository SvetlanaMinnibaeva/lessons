package lesson5Mos;

public class Methods {
    // 1) Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте
    public static int getVowelsCount(String text) {
        return text.toLowerCase().replaceAll("[^aeiouyауоыэяюёие]", "").length();
    }

    //  2) Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке
    public static void printReverseText(String text) {
        System.out.println(new StringBuilder(text).reverse());
    }

    //3) Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации
    public static void printPunctuationSignCount(String text) {
        System.out.println(text.replaceAll("[^,.!:;?()-]", "").length());
    }

    // 4) В метод передаем кол-во строк и кол-во колонок,
    // метод печатает на консоль квадрат из единичек по этим параметрам
    public static void printSquare(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == arr.length - 1 || j == arr[i].length - 1 || i == 0 || j == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 5) В метод передаем 3 числа, метод должен вернуть меньшее число из 3х
    public static int getMinOfThreeNumbers(int x, int y, int z) {
        return Math.min(Math.min(x, y), Math.min(y, z));
    }

    //6) В метод передаем сумму депозита, банковский процент и кол-во лет,
    // и метод возвращает значение прироста процентов которые мы заберем с банка через столько лет
    public static double getProcentSum(double deposit, double percent, int years) {
        double sum = deposit;
        for (int i = 1; i <= years; i++) {
            sum += sum * percent / 100;
        }
        return sum - deposit;
    }

    //7) В метод передаем email, метод должен вернуть true или false подходит нам email или нет.
    // Подходит: когда содержит @, когда нет пробелов, когда часть текста после @ содержит в себе точку
    public static boolean checkEmail(String email) {
        return email.replaceAll("[^@]", "").length() == 1
                && !(email.contains(" "))
                && email.indexOf('@') + 1 < email.indexOf('.');
    }
}



