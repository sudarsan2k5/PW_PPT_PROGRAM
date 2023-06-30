public class Sparse_Matrix_Multiplication {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;    // Number of rows in mat1
        int k = mat1[0].length; // Number of columns in mat1
        int n = mat2[0].length; // Number of columns in mat2

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int x = 0; x < k; x++) {
                    result[i][j] += mat1[i][x] * mat2[x][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = { { 1, 0, 0 }, { -1, 0, 3 } };
        int[][] mat2 = { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };

        int[][] result = multiply(mat1, mat2);

        printMatrix(result);
    }
}
