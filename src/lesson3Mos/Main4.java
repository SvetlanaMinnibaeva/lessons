package lesson3Mos;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int even = 30;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = even;
            even += 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
