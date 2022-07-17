package lesson3Mos;

public class HomeWorkArr3 {
    public static void main(String[] args) {
        System.out.println("1) Сколько в массиве четных цифр?");
        int[] arr = {22, 341, 18, 35, 17, 82, 34, 3, 11};
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println(countEven);


        System.out.println("Все числа с массива, которые больше 10, но меньше 25.");
        for (int j : arr) {
            if (10 < j && j < 25) {
                System.out.println(j);
            }
        }


        System.out.println("Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трем.");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }


        System.out.println(" ***Только те числа, которые содержат в себе символ 4. ");
        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).contains("4")) {
                System.out.println(arr[i]);
            }
        }
    }
}
