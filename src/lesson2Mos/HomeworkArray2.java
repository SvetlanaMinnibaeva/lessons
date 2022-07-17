package lesson2Mos;

import java.util.Arrays;

public class HomeworkArray2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Четных чисел: " + countEven
                + "\nНечетных чисел: " + countOdd);
    }
}

