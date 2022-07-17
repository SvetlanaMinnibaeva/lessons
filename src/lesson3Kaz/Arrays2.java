package lesson3Kaz;

public class Arrays2 {
    public static void main(String[] args) {
        //   int[][] mass = new int[5][6];
        //    int i = mass.length;
        //    int j = mass[i].length;

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
