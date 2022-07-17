package lesson9Kaz;
public class Matrix implements IMatrix {
    private double[][] matrix;

    public Matrix() {
        this.matrix = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rows, int columns) {
        this.matrix = new double[rows][columns];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return this.matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex > matrix.length || colIndex > matrix[0].length) {

        } else {
            this.matrix[rowIndex][colIndex] = value;
        }
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++)
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i,j) + otherMatrix.getValueAt(i, j));
            }
        return matrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++)
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i,j) - otherMatrix.getValueAt(i, j));
            }
        return matrix;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrix matrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++)
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.matrix[i][j] * otherMatrix.getValueAt(i, j));
            }
        return matrix;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrix matrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++)
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.matrix[i][j] * value);
            }
        return matrix;
    }

    @Override
    public IMatrix transpose() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = i + 1; j < this.getColumns(); j++) {
                double temp = this.getValueAt(i, j);
                this.setValueAt(i, j,this.getValueAt(j, i));
                this.setValueAt(j, i, temp);
            }
        }
        return this;
    }

        @Override
        public void fillMatrix ( double value){
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    this.setValueAt(i, j, value);
                }
            }
        }

        @Override
        public double determinant () {
            return 0;
        }

        @Override
        public boolean isNullMatrix () {
            boolean isNull = false;
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    if (this.getValueAt(i, j) == 0)
                        isNull = true;
                }
            }
            return isNull;
        }

        @Override
        public boolean isIdentityMatrix () {
            boolean isIdentity = false;
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    if (this.getValueAt(i, j) == 0 && i != j) {
                        isIdentity = true;
                    }
                    if ((this.getValueAt(i, j) == 1 && i == j))
                        isIdentity = true;
                }
            }
            return isIdentity;
        }

        @Override
        public boolean isSquareMatrix () {
            return this.getRows() == this.getColumns();
        }

        @Override
        public void printToConsole () {
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    System.out.print(this.getValueAt(i, j) + " ");
                }
                System.out.println("");
            }
        }
    }

