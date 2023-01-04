import java.util.Random;

public class Matrix {
    private double[][] matrix;
    private int n;//row
    private int m;//col
    Random num = new Random();

    public Matrix(int n, int m) {
        this.matrix = new double[n][m];
        this.n = n;
        this.m = m;

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                this.matrix[i][j] = this.num.nextDouble(10.0);
            }
        }
    }

    public void add(Matrix other) {
        if (this.n == other.n && this.m == other.m) {
            int i;
            int j;
            for(i = 0; i < this.n; ++i) {
                for(j = 0; j < this.m; ++j) {
                    double[] var10000 = this.matrix[i];
                    var10000[j] += other.matrix[i][j];
                }
            }

            for(i = 0; i < this.n; ++i) {
                for(j = 0; j < this.m; ++j) {
                    System.out.print(this.matrix[i][j]);
                }

                System.out.println();
            }

        } else {
            throw new IllegalArgumentException("Cannot add matrices with different dimensions");
        }
    }

    public void multiply(double number) {
        for(int i = 0; i < this.n; ++i) {
            for(int j = 0; j < this.m; ++j) {
                double[] var10000 = this.matrix[i];
                var10000[j] *= number;
            }
        }

    }

    public void print() {
        for(int i = 0; i < this.n; ++i) {
            for(int j = 0; j < this.m; ++j) {
                System.out.print(this.matrix[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.m != m2.n) {
            throw new IllegalArgumentException("Cannot multiply matrices with incompatible dimensions");
        } else {
            Matrix result = new Matrix(m1.n, m2.m);

            for(int i = 0; i < result.n; ++i) {
                for(int j = 0; j < result.m; ++j) {
                    double sum = 0.0;

                    for(int k = 0; k < m1.m; ++k) {
                        sum += m1.matrix[i][k] * m2.matrix[k][j];
                    }

                    result.matrix[i][j] = sum;
                }
            }

            return result;
        }
    }
}