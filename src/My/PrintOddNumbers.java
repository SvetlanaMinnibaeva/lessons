package My;

public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 6, 4, 5};
        printOddNumbers(arr);
    }


    public static void printOddNumbers(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int j : arr) {
            if (!(j % 2 == 0))
                res.append(j).append(",");
        }
        res.setLength(res.length() - 1);
        System.out.println(res);
    }
}


