import java.util.Random;

public class Matrix {
    private static int size;
    private static int[][] matrix;

    public Matrix(int inSize) {
        size = inSize;
        initMatrix();
    }

    public void initMatrix() {
        Random random = new Random();
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(String.format("%3d ", matrix[i][j]));
            }
            System.out.println();
        }
    }

    public void rotateRight() {
        int ret[][] = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                ret[col][size-1-row] = matrix[row][col];
            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = ret[row][col];
            }
        }
    }

    public Matrix rotate(int deg) {
        int curdeg = 0;
        while (curdeg < deg) {
            this.rotateRight();
            curdeg += 90;
        }
        return this;
    }
}