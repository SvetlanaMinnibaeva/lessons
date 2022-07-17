package lesson4Mos;

public class Homework4Arr {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        int a = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j == a ? arr[i][j] + " " : "* ");
            }
            a--;
            System.out.println();
        }
        System.out.println();



        int b = arr.length / 2;
        int c = b;
        for (int i = 0; i <= arr.length / 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j > b || j < c ? "* " : arr[i][j] + " ");
            }
            System.out.println();
            b++;
            c--;
        }
        for (int i = arr.length / 2; i > 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();



        int d = arr.length / 2;
        int e = d;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j > e || j < d ? "* " : arr[i][j] + " ");
            }
            System.out.println();
            if (i < arr.length / 2) {
                e++;
                d--;
            } else {
                e--;
                d++;
            }
        }
        System.out.println();


        int[][] arr1 = new int[10][10];
        int f = arr1.length / 2;
        int g = (arr1.length - 1) / 2;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(j > f || j < g ? "* " : arr1[i][j] + " ");
            }
            System.out.println();
            if (i < (arr1.length - 1) / 2) {
                f++;
                g--;
            } else if(i > (arr1.length / 2) - 1){
                f--;
                g++;
            }
        }
    }
}
