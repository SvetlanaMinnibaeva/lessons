package lesson9Kaz;

public class Main {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(4, 4);
        matrix1.fillMatrix(3.3);
        matrix1.printToConsole();
        System.out.println();

        Matrix matrix2 = new Matrix(4, 4);
        matrix2.fillMatrix(5.5);
        matrix2.printToConsole();
        System.out.println();

        IMatrix matrix3 = matrix1.add(matrix2);
        matrix3.printToConsole();
        System.out.println();

        matrix3 = matrix2.sub(matrix1);
        matrix3.printToConsole();
        System.out.println();

        matrix3 = matrix1.mul(matrix2);
        matrix3.printToConsole();
        System.out.println();

        matrix3 = matrix1.mul(0);
        matrix3.printToConsole();
        System.out.println();

        Matrix matrix4 = new Matrix(5, 4);
        System.out.println(matrix4.isSquareMatrix());
        System.out.println();

        matrix4.fillMatrix(0.0);
        System.out.println(matrix4.isNullMatrix());
        System.out.println();

        Matrix matrix5 = new Matrix(5, 5);
        for (int i = 0; i < matrix5.getRows(); i++) {
            for (int j = 0; j < matrix5.getColumns(); j++) {
                if (i == j) {
                    matrix5.setValueAt(i, j, 1);
                }
            }
        }
        matrix5.printToConsole();
        System.out.println(matrix5.isIdentityMatrix());
        System.out.println(matrix1.isIdentityMatrix());
        System.out.println();

        Matrix matrix6 = new Matrix(4, 4);

        for (int i = 0; i < matrix6.getRows(); i++) {
            for (int j = 0; j < matrix6.getColumns(); j++) {
                matrix6.setValueAt(i, j, 3.3 + i);
            }
        }
        matrix6.printToConsole();
        System.out.println();
        matrix6.transpose();
        matrix6.printToConsole();
    }
}
