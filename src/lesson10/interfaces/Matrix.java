package lesson10.interfaces;

public class Matrix implements IMatrix {
    private double[][] matrix;

    public Matrix() {
    }

    public Matrix(int rows, int column) {
        matrix = new double[rows][column];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= getRows()) {
            System.out.println("Слишком большой индекс строки");
            return -1;
        }
        if (colIndex >= getColumns()) {
            System.out.println("Слишком большой индекс колонки");
            return -1;
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= getRows()) {
            System.out.println("Слишком большой индекс строки");
            return;
        }
        if (colIndex >= getColumns()) {
            System.out.println("Слишком большой индекс колонки");
            return;
        }
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Неравное кол.во. срок");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Неравное кол.во. колонок");
        }
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getColumns(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - result.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.matrix.length != otherMatrix.getRows())
            return null;
        Matrix newMatrix = new Matrix(matrix.length, otherMatrix.getColumns());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < matrix.length; k++) {
                    newMatrix.setValueAt(i, j, this.getValueAt(i, j) * otherMatrix.getValueAt(k, j));
                }
            }
        }
        return newMatrix;
    }

    @Override
    public IMatrix mul(double value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                this.setValueAt(i, j, (this.getValueAt(i, j) * value));
            }
        }
        return this;
    }

    @Override
    public IMatrix transpose() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                this.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return null;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0.0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            }
        }
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if (matrix.length == matrix[0].length) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
