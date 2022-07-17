package lesson3Kaz;

public class Homework3 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(i == j ? arr[i][j] + " " : "* ");
            }
            System.out.println();
        }
        System.out.println();

        int a = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j == a ? arr[i][j] + " " : "* ");
            }
            a--;
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j == arr.length / 2 || i == arr.length / 2 ? arr[i][j] + " " : "* ");
            }
            System.out.println();
        }
        System.out.println();

        int b = arr.length / 2;
        int c = b;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j > b || j < c ? "* " : arr[i][j] + " ");
            }
            System.out.println();
            if (i < arr.length / 2) {
                b++;
                c--;
            } else {
                b--;
                c++;
            }
        }
    }
}




